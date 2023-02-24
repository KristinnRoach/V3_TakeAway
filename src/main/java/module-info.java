module com.example.v3_takeaway {
    requires javafx.controls;
    requires javafx.fxml;


    opens Vidmot to javafx.fxml;
    exports Vidmot;
}