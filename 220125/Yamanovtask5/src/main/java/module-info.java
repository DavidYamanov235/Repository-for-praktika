module ru.yamanov.yamanovtask5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.yamanov.yamanovtask5 to javafx.fxml;
    exports ru.yamanov.yamanovtask5;
}