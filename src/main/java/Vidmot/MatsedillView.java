package Vidmot;


import Vinnsla.Veiting;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

// Heitir MatsedillView í verkefnalýsingu en er bara Controller fyrir matsedill-view.fxml right?
public class MatsedillView extends ListView implements Initializable {

    @FXML
    ListView<Veiting> sedillListView;
    Veiting currentVeiting;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sedillListView.getItems().addAll();
    }

}
