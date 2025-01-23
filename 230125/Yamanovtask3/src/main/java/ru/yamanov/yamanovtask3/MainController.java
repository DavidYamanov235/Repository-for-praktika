package ru.yamanov.yamanovtask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class MainController {

    @FXML
    private Label el1;

    @FXML
    private Label el2;

    @FXML
    private Label el3;

    @FXML
    private TextField numberTextField;

    @FXML
    private Button showButton;

    @FXML
    private TextField znachTextField;

    @FXML
    void showOnAction(ActionEvent event) {
        double R=0, D=0, L=0, S=0;
        int n=Integer.parseInt(numberTextField.getText());
        double zn=Double.parseDouble(znachTextField.getText());
        switch (n){
            case 1:
                el1.setText("Диаметр"+" "+2*zn);
                el2.setText("Длина окруж"+" "+2*PI*zn);
                el3.setText("Площадь"+" "+PI*pow(zn, 2));
                break;
            case 2:
                el1.setText("Радиус"+" "+zn/2);
                el2.setText("Длина окруж"+" "+2*PI*(zn/2));
                el3.setText("Площадь"+" "+PI*pow(zn/2, 2));
                break;
            case 3:
                el1.setText("Радиус"+" "+zn/(2*PI));
                el2.setText("Диаметр"+" "+zn/PI);
                el3.setText("Площадь"+" "+pow(PI,2)/(4*PI));
                break;
            case 4:
                el1.setText("Радиус"+" "+zn/(2*PI));
                el2.setText("Диаметр"+" "+zn/PI);
                el3.setText("Длина окруж"+" "+PI*(4*zn));
                break;

        }
    }

}
