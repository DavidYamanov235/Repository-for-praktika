module ru.yamanov.yamanovtask1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovtask1 to javafx.fxml;
    exports ru.yamanov.yamanovtask1;
}