package Vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/*Skrifaðu t.d. aðferðina setjaGogn() og smíðaðu nokkrar veitingar til að setja í listann.
Ef þú treystir þér til geturðu lesið gögnin úr skrá. Gættu þess bara að skráarslóðin sé relative og í resources.
 */

public class Matsedill {
    // FIELDS
    protected ObservableList<Veiting> veitingaListi = FXCollections.observableArrayList();
    // GETTERS & SETTERS
    public ObservableList<Veiting> getVeitingaListi() {
        return veitingaListi;
    }
    public void setVeitingaListi(ObservableList<Veiting> veitingaListi) {
        this.veitingaListi = veitingaListi;
    }
    // METHODS
    private void setjaGogn(){
        this.veitingaListi.add(new Veiting("Epli", 199));
        this.veitingaListi.add(new Veiting("Súkkulaði", 399));
        this.veitingaListi.add(new Veiting("Skúffukaka", 599));
    }
}
