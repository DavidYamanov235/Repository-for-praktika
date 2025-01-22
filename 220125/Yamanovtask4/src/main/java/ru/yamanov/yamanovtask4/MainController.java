package ru.yamanov.yamanovtask4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class MainController {

    @FXML
    private TextField xTextField;

    @FXML
    private Button yButton;

    @FXML
    private Label yLabel;

    @FXML
    void yOnAction(ActionEvent event) {
        double y;
        double x=Double.parseDouble(xTextField.getText());
        if (x<0){
            y=pow(x,2)-3-cbrt(PI-x);
        }
        else if (x>=1){
           y= x*(pow(x,2)+3)+log(PI+x);
        }
        else {
            y=pow(pow(x,2)+3,2)-sqrt(0.5*PI+x);
        }
        yLabel.setText(String.valueOf("y="+y));
    }

}
