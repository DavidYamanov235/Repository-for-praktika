package ru.yamanov.yamanovtaskdop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label numberLabel;

    @FXML
    private TextField numberTextField;

    @FXML
    private Button showButton;

    @FXML
    void showOnAction(ActionEvent event) {
        double num=Double.parseDouble(numberTextField.getText());
        if (num>0){
            if (num%2==0){
                numberLabel.setText("Число четное, положительное");
            } else  {
                numberLabel.setText("Число нечетное, положительное");
            }
        } else if (num==0) {
            numberLabel.setText("Это ноль");
        }else {
            if (num%2==0){
                numberLabel.setText("Число четное, отрицательное");
            }
            else {
                numberLabel.setText("Число нечетное, отрицательное");
            }
        }

    }

}
