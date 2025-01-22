module ru.yamanov.yamanovask3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovask3 to javafx.fxml;
    exports ru.yamanov.yamanovask3;
}