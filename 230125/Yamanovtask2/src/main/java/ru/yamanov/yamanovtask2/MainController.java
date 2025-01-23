package ru.yamanov.yamanovtask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField MTextField;

    @FXML
    private TextField NTextField;

    @FXML
    private Label cardLabel;

    @FXML
    private Button showButton;

    @FXML
    void showOnAction(ActionEvent event) {
        String masty="";
        String dost="";
        int M=Integer.parseInt(MTextField.getText());
        int N=Integer.parseInt(NTextField.getText());
        switch (M){
            case 1:
                masty="Пика";
                break;
            case 2:
                masty="Трефа";
                break;
            case 3:
                masty="Бубен";
                break;
            case 4:
                masty="Червей";
                break;
        }
        switch (N){
            case 6:
                dost="Шестерка";
                break;
            case 7:
                dost="Семерка";
                break;
            case 8:
                dost="Восьмерка";
                break;
            case 9:
                dost="Девятка";
                break;
            case 10:
                dost="Десятка";
                break;
            case 11:
                dost="Валет";
                break;
            case 12:
                dost="Дама";
                break;
            case 13:
                dost="Король";
                break;
            case 14:
                dost="Туз";
                break;
        }
        cardLabel.setText(dost+""+masty);

    }

}
