package ru.yamanov.yamanovtask5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button checkButton;

    @FXML
    private Label pointLabel;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void checkOnAction(ActionEvent event) {
        double x=Double.parseDouble(xTextField.getText());
        double y=Double.parseDouble(yTextField.getText());
        if ((y<23)&&(y>-x)&&(x<0)){
            pointLabel.setText(String.valueOf("Да"));
        }else if ((y==23)||(y==-x)||(x==0)){
            pointLabel.setText(String.valueOf("На границе"));
        }else {
            pointLabel.setText(String.valueOf("Нет"));
        }
    }

}
