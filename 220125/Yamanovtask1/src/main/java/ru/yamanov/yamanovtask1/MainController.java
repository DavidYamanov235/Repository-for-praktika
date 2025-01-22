package ru.yamanov.yamanovtask1;

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
    private Button calculateButton;

    @FXML
    private Label resultLabel;

    @FXML
    void calculateOnAction(ActionEvent event) {
        int M=Integer.parseInt(MTextField.getText());
        int N=Integer.parseInt(NTextField.getText());
        if (M%N!=0){
            resultLabel.setText("M на N нацело не делится");
        } else {
            resultLabel.setText(String.valueOf("Ответ:"+""+M/N));
        }

    }

}
