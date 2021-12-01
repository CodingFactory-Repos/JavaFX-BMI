module me.loule.bmi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.bmi to javafx.fxml;
    exports me.loule.bmi;
}