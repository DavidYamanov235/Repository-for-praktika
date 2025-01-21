package ru.yamanov.yamanovtask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainCotroller {

    @FXML
    private Button Find;

    @FXML
    private TextField NewNumberTextField;

    @FXML
    private TextField NumberTextField;

    @FXML
    void FindOnAction(ActionEvent event) {
        int number =Integer.parseInt(NumberTextField.getText());
        int ostnum=number%100;
        int selnum=number/100;
        NewNumberTextField.setText(""+ostnum+""+selnum);

    }

}
