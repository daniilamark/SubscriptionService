package com.da.subscriptionservice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    SubscriptionService service = new SubscriptionService();
    String result;

    @FXML
    private Label resultText;
    private Button btn;
    @FXML
    private TextField textField;

    @FXML
    private void click(ActionEvent event) {
        String a = textField.getText();
        result = service.searchByName(a);
        resultText.setText(result);

        System.out.println("===========");
    }



}