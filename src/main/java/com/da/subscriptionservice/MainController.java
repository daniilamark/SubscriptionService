package com.da.subscriptionservice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private Label resultText;
    private Button btn;
    @FXML
    private TextField textField;

    @FXML
    private void click(ActionEvent event) {
        resultText.setText(String.valueOf(textField.getText()));
        System.out.println("hello");
    }
}