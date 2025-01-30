package ru.yamanov.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.yamanov.marathon.util.Manager.*;

public class SevenController {

    @FXML
    private Button backButton;

    @FXML
    private Button outButton;

    @FXML
    private Button regButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSixStage("scene6.fxml", "Марафон");

    }

    @FXML
    void outButtonOnAction(ActionEvent event) {
        showMainStage(mainStage, "scene1.fxml","Марафон");

    }

    @FXML
    void regButtonOnAction(ActionEvent event) {
        showFourStage("scene4.fxml","Марафон");

    }

}
