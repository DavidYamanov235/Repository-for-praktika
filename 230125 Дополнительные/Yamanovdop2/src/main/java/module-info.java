module ru.yamanov.yamanovdop2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovdop2 to javafx.fxml;
    exports ru.yamanov.yamanovdop2;
}