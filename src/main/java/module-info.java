module com.example.csd214_manraj {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.csd214_manraj to javafx.fxml;
    exports com.example.csd214_manraj;
}