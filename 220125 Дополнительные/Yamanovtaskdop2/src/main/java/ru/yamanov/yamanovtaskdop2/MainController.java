package ru.yamanov.yamanovtaskdop2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label numberLabel;

    @FXML
    private TextField nuvberTexField;

    @FXML
    private Button showButton;

    @FXML
    void showOnAction(ActionEvent event) {
        int num = Integer.parseInt(nuvberTexField.getText());
        if (num<1000) {
            if (num >= 100) {
                if (num % 2 == 0) {
                    numberLabel.setText("Трехзначное, четное число");
                } else {
                    numberLabel.setText("Трехзначное, нечетное число");
                }
            } else if ((num < 100) && (num >= 10)) {
                if (num % 2 == 0) {
                    numberLabel.setText("Двузначное, четное число");
                } else {
                    numberLabel.setText("Двузначное, нечетное число");
                }
            } else {
                if (num % 2 == 0) {
                    numberLabel.setText("Однозначное, четное число");
                } else {
                    numberLabel.setText("Однозначное, нечетное число");
                }
            }
        }else{
            numberLabel.setText("Число больше 999");
        }
    }

}
