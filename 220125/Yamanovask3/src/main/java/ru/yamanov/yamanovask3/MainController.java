package ru.yamanov.yamanovask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button CheckButton;

    @FXML
    private TextField FourTexField;

    @FXML
    private Label NumberLabel;

    @FXML
    private TextField OneTexField;

    @FXML
    private TextField ThreeTexField;

    @FXML
    private TextField TwoTexField;

    @FXML
    void CheckOnAction(ActionEvent event) {
        int num1=Integer.parseInt(OneTexField.getText());
        int num2=Integer.parseInt(TwoTexField.getText());
        int num3=Integer.parseInt(ThreeTexField.getText());
        int num4=Integer.parseInt(FourTexField.getText());
        if((num2==num3)&&(num3==num4)){
            NumberLabel.setText("This is:"+""+num1);
        }
        if((num1==num3)&&(num3==num4)){
            NumberLabel.setText("This is:"+""+num2);
        }
        if((num2==num1)&&(num1==num4)){
            NumberLabel.setText("This is:"+""+num3);
        }else {
            NumberLabel.setText("This is:"+""+num4);
        }





    }

}
