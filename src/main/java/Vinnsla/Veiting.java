package Vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/* í hlut af klasanum er eitt atriði t.d. Margarita pizza, 2990.
Skrifaðu aðferðina toString() eins og þið viljið að veitingarnar birtist í lista.
 */
public class Veiting {
    // FIELDS
    private StringProperty rettur = new SimpleStringProperty();
    private IntegerProperty verd = new SimpleIntegerProperty();

    // Constructor
    public Veiting(String rettur, int verd) {
        this.rettur.set(rettur);
        this.verd.set(verd);
    }
    // GETTERS & SETTERS
    public int getVerd() {
        return verd.get();
    }
    public IntegerProperty verdProperty() {
        return verd;
    }
    public void setVerd(int verd) {
        this.verd.set(verd);
    }

    public String getRettur() {
        return rettur.get();
    }

    public StringProperty retturProperty() {
        return rettur;
    }

    public void setRettur(String rettur) {
        this.rettur.set(rettur);
    }

    // METHODS
    public String toString(){
        return this.rettur.get() + ". Verð: " + this.verd.get();
    }
}
