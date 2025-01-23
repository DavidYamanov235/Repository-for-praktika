module ru.yamanov.yamanovdop1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovdop1 to javafx.fxml;
    exports ru.yamanov.yamanovdop1;
}