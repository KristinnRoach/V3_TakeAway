package Vidmot;

import Vinnsla.Karfa;
import Vinnsla.Veiting;
import Vinnsla.Vidskiptavinur;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class PontunController {
    @FXML
    private ListView<Veiting> fxKarfa;
    @FXML
    private Label fxSamtals;
    @FXML
    private MatsedillView fxMatsedill;
    @FXML
    private final Karfa karfa = new Karfa();
    private Vidskiptavinur vidskiptavinur = null;

    public void initialize() {
        fxKarfa.setItems(karfa.getVeiting()); //tengja vidmot og vinnslu
        fxSamtals.textProperty().bind(karfa.heildarVerdProperty().asString());
    }

    public Label getFxSamtals() {return fxSamtals;}
    // public void fxGreida(ActionEvent actionEvent) { ViewSwitcher.switchTo(View.GREIDSLA); }

    public void setjaKorfu(ActionEvent actionEvent) {
        if (fxMatsedill.getSelectionModel().getSelectedItem() != null)
            fxKarfa.getItems().add((Veiting) fxMatsedill.getSelectionModel().getSelectedItem());
    }
    public void takaUrKorfu(ActionEvent actionEvent) {
        if (fxKarfa.getSelectionModel().getSelectedItem() !=  null)
            fxKarfa.getItems().remove(fxKarfa.getSelectionModel().getSelectedItem());
    }
    public void fxInnskraningHandler(ActionEvent actionEvent) {

    }
}