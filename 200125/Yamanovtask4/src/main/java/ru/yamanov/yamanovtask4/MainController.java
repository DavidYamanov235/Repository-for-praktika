package ru.yamanov.yamanovtask4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class MainController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private Button FindLabel;

    @FXML
    private Label RezultLabel;

    @FXML
    private TextField xTextField;

    @FXML
    void FindOnAction(ActionEvent event) {
        double A=Double.parseDouble(ATextField.getText());
        double B=Double.parseDouble(BTextField.getText());
        double x=Double.parseDouble(xTextField.getText());
        double y=-pow(A,5)*x+B*pow(cos(x),pow(x,2))+B*x;
        if (log(abs(x+pow(y,2)))!=0){
            double g=sqrt(abs(-A*x+y))/(log(abs(x+pow(y,2))));
            RezultLabel.setText(String.valueOf(g));
        }else{
            RezultLabel.setText("Ошибка");
        }


    }

}
