package ru.yamanov.yamanovtask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label dayLabel;

    @FXML
    private TextField numberTextField;

    @FXML
    private Button showButton;

    @FXML
    void ShowOnAction(ActionEvent event) {
        String day="";
        int d=Integer.parseInt(numberTextField.getText());
        if ((d>0)&&(d<8)) {
            switch (d) {
                case 1:
                    day = "Понедельник";
                    break;
                case 2:
                    day = "Вторник";
                    break;
                case 3:
                    day = "Среда";
                    break;
                case 4:
                    day = "Четверг";
                    break;
                case 5:
                    day = "Пятница";
                    break;
                case 6:
                    day = "Суббота";
                    break;
                case 7:
                    day = "Воскресение";
                    break;

            }
            dayLabel.setText("Это" + day);
        }else {
            dayLabel.setText("Введены некорректные данные");
        }
    }

}
