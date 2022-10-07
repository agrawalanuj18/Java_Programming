module com.conditional.main {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.conditional.main to javafx.fxml;
    exports com.conditional.main;
}