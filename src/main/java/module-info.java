module me.loule.bmi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.bmi to javafx.fxml;
    exports me.loule.bmi;
    exports me.loule.bmi.controller;
    opens me.loule.bmi.controller to javafx.fxml;
}