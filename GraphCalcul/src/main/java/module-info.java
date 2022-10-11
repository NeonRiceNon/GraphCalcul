module com.example.graphcalcul {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.graphcalcul to javafx.fxml;
    exports com.example.graphcalcul;
}