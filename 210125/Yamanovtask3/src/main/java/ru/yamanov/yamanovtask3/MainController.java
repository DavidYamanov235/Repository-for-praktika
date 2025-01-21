package ru.yamanov.yamanovtask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label dayLabel;

    @FXML
    private Button knowButton;

    @FXML
    private TextField numTextfield;

    @FXML
    void knowOnAction(ActionEvent event) {
        int d=Integer.parseInt(numTextfield.getText());
        int day=d%7;
        switch (day){
            case 0:
                day=0;
                break;
            case 1:
                day=1;
                break;
            case 2:
                day=2;
                break;
            case 3:
                day=3;
                break;
            case 4:
                day=4;
                break;
            case 5:
                day=5;
                break;
            case 6:
                day=6;
                break;
        }
        dayLabel.setText(String.valueOf(day));

    }

}
