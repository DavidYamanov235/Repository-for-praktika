package ru.yamanov.yamanovtask6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button Button;

    @FXML
    private TextField numTextField;

    @FXML
    private Label sumLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        int num = Integer.parseInt(numTextField.getText());
        int lastnum = 0;
        while (num > 0) {
            lastnum = num % 10;
            sumLabel.setText(String.valueOf(" "+lastnum+" "));
            num /= 10;
        }
    }

}
