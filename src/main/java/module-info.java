module com.da.subscriptionservice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.da.subscriptionservice to javafx.fxml;
    exports com.da.subscriptionservice;
}