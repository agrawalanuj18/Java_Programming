module com.example.question {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.question to javafx.fxml;
    exports com.example.question;
}