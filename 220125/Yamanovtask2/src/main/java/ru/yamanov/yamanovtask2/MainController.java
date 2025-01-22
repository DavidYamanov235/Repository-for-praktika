package ru.yamanov.yamanovtask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button ClickButton;

    @FXML
    private TextField EnterTextField;

    @FXML
    private Label NewNumberLabel;

    @FXML
    void ClickOnAction(ActionEvent event) {
        double num=Integer.parseInt(EnterTextField.getText());
        if (num>0){
            num-=8;
            NewNumberLabel.setText(String.valueOf("New number:"+""+num));
        }else{
            NewNumberLabel.setText(String.valueOf(num));
        }

    }

}
