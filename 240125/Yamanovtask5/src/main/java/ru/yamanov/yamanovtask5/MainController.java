package ru.yamanov.yamanovtask5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class MainController {

    @FXML
    private Label answerLabel;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField xnumberTextField;

    @FXML
    void calculateOnAction(ActionEvent event) {
        int j=Integer.parseInt(xnumberTextField.getText());
        double a=1;
        for (int k=0; k<14; k++){
            a+=a/pow(2,j-1);
        }
        answerLabel.setText(String.valueOf(a));
    }

}
