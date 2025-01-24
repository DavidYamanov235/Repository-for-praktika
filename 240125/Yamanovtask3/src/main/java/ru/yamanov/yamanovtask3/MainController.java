package ru.yamanov.yamanovtask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField AnumberTextField;

    @FXML
    private TextField BnumberTextField;

    @FXML
    private Button CalculateButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Label colLabel;

    @FXML
    void CalculateButtonOnAction(ActionEvent event) {
        int A=Integer.parseInt(AnumberTextField.getText());
        int B=Integer.parseInt(BnumberTextField.getText());
        String result = "";
        int colv=0;
        if (A<B) {
            while (A <= B) {
                result += " " + A;
                A++;
                colv++;

            }
        }else{
            answerLabel.setText("Число A больше B");
        }
        answerLabel.setText(result);
        colLabel.setText("Количество чисел:"+" "+colv);


    }

}
