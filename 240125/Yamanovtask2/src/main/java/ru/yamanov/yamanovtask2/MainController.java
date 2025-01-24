package ru.yamanov.yamanovtask2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class MainController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data =dataListView.getItems();
        int n = data.get(0);
        int c = 0;
        for (int i = 1; i <= n; i++) {
            int m = data.get(i);
            if (m % 8 == 0 && m>9 && m<100) {
                c++;
            }
        }
        answerLabel.setText(String.valueOf(c));
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText());
            dataListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            numberTextField.setText("");
        }
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }


}
