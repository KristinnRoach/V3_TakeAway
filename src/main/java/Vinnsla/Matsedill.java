package Vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/*Skrifaðu t.d. aðferðina setjaGogn() og smíðaðu nokkrar veitingar til að setja í listann.
Ef þú treystir þér til geturðu lesið gögnin úr skrá. Gættu þess bara að skráarslóðin sé relative og í resources.
 */

public class Matsedill {
    // FIELDS
    protected ObservableList<Veiting> matsedillList = FXCollections.observableArrayList();
    // GETTERS & SETTERS
    public ObservableList<Veiting> getMatsedillList() {
        return matsedillList;
    }
    public void setMatsedillList(ObservableList<Veiting> matsedillList) {
        this.matsedillList = matsedillList;
    }
    // METHODS
    private void setjaGogn(){
        this.matsedillList.add(new Veiting("Epli", 199));
        this.matsedillList.add(new Veiting("Súkkulaði", 399));
        this.matsedillList.add(new Veiting("Skúffukaka", 599));
    }
}
