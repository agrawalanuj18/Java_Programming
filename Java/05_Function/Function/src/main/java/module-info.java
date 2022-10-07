module com.example.function {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.function to javafx.fxml;
    exports com.example.function;
}