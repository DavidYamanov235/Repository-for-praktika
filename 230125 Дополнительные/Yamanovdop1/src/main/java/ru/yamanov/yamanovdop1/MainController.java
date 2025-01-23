package ru.yamanov.yamanovdop1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField enterTextField;

    @FXML
    private Button findButton;

    @FXML
    private Label label;

    @FXML
    private Label label1;

    @FXML
    private Label lаbеl2;

    @FXML
    void buttonOnAction(ActionEvent event) {
        int n=Integer.parseInt(enterTextField.getText());
        if (n/10==1)
            switch (n) {
                case 10:
                    label.setText("десять учебных заданий.");
                    break;
                case 11:
                    label.setText("Одиннадцать учебных заданий.");
                    break;
                case 12:
                    label.setText("двенадцать учебных заданий.");
                    break;
                case 13:
                    label.setText("тринадцать учебных заданий.");
                    break;
                case 14:
                    label.setText("четырнадцать учебных заданий.");
                    break;
                case 15:
                    label.setText("пятнадцать учебных заданий.");
                    break;
                case 16:
                    label.setText("шестнадцать учебных заданий.");
                    break;
                case 17:
                    label.setText("семнадцать учебных заданий.");
                    break;
                case 18:
                    label.setText("восемнадцать учебных заданий.");
                    break;
                case 19:
                    label.setText("девятнадцать учебных заданий.");
                    break;
            }
        else {
            switch (n/10) {
                case 2:
                    label.setText("двадцать ");
                    break;
                case 3:
                    label.setText("тридцать ");
                    break;
                case 4:
                    label.setText("сорок ");
                    break;
            }

            switch (n%10) {
                case 1:
                    label1.setText("одно");
                    break;
                case 2:
                    label1.setText("два");
                    break;
                case 3:
                    label1.setText("три ");
                    break;
                case 4:
                    label1.setText("четыре");
                    break;
                case 5:
                    label1.setText("пять");
                    break;
                case 6:
                    label1.setText("шесть");
                    break;
                case 7:
                    label1.setText("семь");
                    break;
                case 8:
                    label1.setText("восемь");
                    break;
                case 9:
                    label1.setText("девять");
                    break;
            }

            switch (n%10) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    lаbеl2.setText("учебных заданий.");
                    break;
                case 1:
                    lаbеl2.setText("учебное задание.");
                    break;
                case 2:
                case 3:
                case 4:
                    lаbеl2.setText("учебных задания.");
                    break;
            }
        }



    }

}
