module ru.yamanov.yamanovdop3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovdop3 to javafx.fxml;
    exports ru.yamanov.yamanovdop3;
}