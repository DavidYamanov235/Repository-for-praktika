package ru.yamanov.yamanovtask2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class MainController {

    @FXML
    private Button Btn1;

    @FXML
    private TextField LTextField;

    @FXML
    private Label RadiusLabel;

    @FXML
    private Label SquareLabel;

    @FXML
    void SetBtn1onAction(ActionEvent event) {
        double L=Double.parseDouble(LTextField.getText());
        double R=L/(2*PI);
        RadiusLabel.setText(String.valueOf(R));
        double S=PI*pow(R,2);
        SquareLabel.setText(String.valueOf(S));


    }

}
