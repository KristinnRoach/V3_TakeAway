module com.example.V3_TakeAway {
    requires javafx.controls;
    requires javafx.fxml;


    opens Vidmot to javafx.fxml;
    exports Vidmot;
}