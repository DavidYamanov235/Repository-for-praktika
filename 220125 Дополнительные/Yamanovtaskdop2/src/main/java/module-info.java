module ru.yamanov.yamanovtaskdop2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovtaskdop2 to javafx.fxml;
    exports ru.yamanov.yamanovtaskdop2;
}