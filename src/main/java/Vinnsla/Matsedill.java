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

/*    public void setMatsedillList(ObservableList<Veiting> matsedillList) {
        this.matsedillList = matsedillList;
    }
*/
    // Smiður
    public Matsedill() { setjaGogn(); }
    // METHODS
    private void setjaGogn(){
        String[] veitingar = {"Epli", "Súkkulaði", "Skúffukaka", "Kaffi", "Te"};
        int[] verdin = {199, 399, 599, 699, 499};

        for(int i = 0; i < veitingar.length; i++){
            Veiting v = new Veiting(veitingar[i], verdin[i]);
            v.setRettur(veitingar[i]);
            v.setVerd(verdin[i]);
            matsedillList.add(v);
        }
    }
}
