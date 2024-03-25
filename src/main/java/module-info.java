module com.example.harmonishare {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.harmonishare to javafx.fxml;
    exports com.example.harmonishare;
}