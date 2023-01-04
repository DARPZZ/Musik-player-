module com.example.musik12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.musik12 to javafx.fxml;
    exports com.example.musik12;
}