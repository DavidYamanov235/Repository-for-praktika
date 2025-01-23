package ru.yamanov.yamanovdop2;

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
        int n = Integer.parseInt(enterTextField.getText());
        switch (n % 100) {
            case 10:
                label1.setText("десять");
                break;
            case 11:
                label1.setText("Одиннадцать");
                break;
            case 12:
                label1.setText("двенадцать");
                break;
            case 13:
                label1.setText("тринадцать");
                break;
            case 14:
                label1.setText("четырнадцать");
                break;
            case 15:
                label1.setText("пятнадцать");
                break;
            case 16:
                label1.setText("шестнадцать");
                break;
            case 17:
                label1.setText("семнадцать");
                break;
            case 18:
                label1.setText("восемнадцать");
                break;
            case 19:
                label1.setText("девятнадцать");
                break;
        }
        switch (n / 100) {
            case 100:
                label.setText("Сто");
                break;
            case 2:
                label.setText("Двести");
                break;
            case 300:
                label.setText("Триста");
                break;
            case 400:
                label.setText("Четыреста");
                break;
            case 500:
                label.setText("Пятьсот");
                break;
            case 600:
                label.setText("Шестьсот");
                break;
            case 700:
                label.setText("Семьсот");
                break;
            case 800:
                label.setText("Восемьсот");
                break;
            case 900:
                label.setText("Девятьсот");
                break;
        }
        switch (n % 10) {
            case 1:
                lаbеl2.setText("Один");
                break;
            case 2:
                lаbеl2.setText("Два");
                break;
            case 3:
                lаbеl2.setText("Три");
                break;
            case 4:
                lаbеl2.setText("Четыре");
                break;
            case 5:
                lаbеl2.setText("Пять");
                break;
            case 6:
                lаbеl2.setText("Шесть");
                break;
            case 7:
                lаbеl2.setText("семь");
                break;
            case 8:
                lаbеl2.setText("Восемь");
                break;
            case 9:
                lаbеl2.setText("Девять");
                break;
        }
        n= (int)(n/10)%10;
        switch (n % 100){
            case 1:
                label1.setText("Десять");
                break;
            case 2:
                label1.setText("Двадцать");
                break;
            case 3:
                label1.setText("Тридцать");
                break;
            case 4:
                label.setText("Сорок");
                break;
            case 5:
                label.setText("Пятьдесят");
                break;
            case 7:
                label.setText("Семьдесят");
                break;
            case 8:
                label.setText("Восемьдесят");
                break;
            case 9:
                label.setText("Девяносто");
                break;
        }



    }

}
