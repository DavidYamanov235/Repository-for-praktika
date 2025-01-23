package ru.yamanov.yamanovtask4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private Button showButton;

    @FXML
    private Label textLabel;

    @FXML
    void showOnAction(ActionEvent event) {
        double A=Double.parseDouble(ATextField.getText());
        double B=Double.parseDouble(BTextField.getText());
        double b=B;

        while (B<=A){
            B+=b;
        }
        B=B-b;
        double L=A-B;
        textLabel.setText(String.valueOf(L));



    }

}
