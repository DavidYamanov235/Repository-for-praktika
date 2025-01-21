package ru.yamanov.yamanovtask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MainController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private Button findButton;

    @FXML
    private Label x1Label;

    @FXML
    private Label x2Label;

    @FXML
    void findOnAction(ActionEvent event) {
        double A=Double.parseDouble(ATextField.getText());
        double B=Double.parseDouble(BTextField.getText());
        double C=Double.parseDouble(CTextField.getText());
        double D=pow(B,2)-4*A*C;
        if(A!=0) {
            double x1 = (-B - sqrt(D)) / 2 * A;
            double x2 = (-B + sqrt(D)) / 2 * A;
            x1Label.setText("" + x1);
            x2Label.setText("" + x2);
        }else {
            x1Label.setText("Ошибка");
        }


    }

}
