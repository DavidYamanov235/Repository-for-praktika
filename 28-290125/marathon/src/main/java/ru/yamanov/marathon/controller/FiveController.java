package ru.yamanov.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

import static ru.yamanov.marathon.util.Manager.*;

public class FiveController {

    @FXML
    private Button backButton;

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private Button goButton;

    @FXML
    private RadioButton rad1;

    @FXML
    private RadioButton rad2;

    @FXML
    private RadioButton rad3;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showFourStage("scene4.fxml", "Марафон");
    }

    @FXML
    void goButtonOnAction(ActionEvent event) {
        showSixStage("scene6.fxml", "Марафон");

    }

}
