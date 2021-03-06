package me.loule.bmi.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import me.loule.bmi.model.BmiModel;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextField inputSize;

    @FXML
    private TextField inputWeight;

    @FXML
    private Text textResult;

    @FXML
    private Button buttonCalculate;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        buttonCalculate.setOnMouseClicked(event -> {
            BmiModel bmi = new BmiModel(Double.parseDouble(inputSize.getText()), Double.parseDouble(inputWeight.getText())); // Call Model to get the result

            String result = "Your BMI is " + (int) Math.round(bmi.getBmi()) + ". You are "; // Set the result text

            if (bmi.getBmi() <= 18.5) {
                textResult.setText(result + "underweight."); // Underweight
            } else if (bmi.getBmi() <= 25) {
                textResult.setText(result + "normal."); // Normal
            } else if (bmi.getBmi() <= 30) {
                textResult.setText(result + "overweight."); // Overweight
            } else {
                textResult.setText(result + "obese."); // Obese
            }
        });
    }
}