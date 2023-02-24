package Vinnsla;

import javafx.beans.Observable;
import javafx.beans.binding.NumberExpression;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener;


/*
 Skrifaðu klasann Karfa sem erfir frá (extends) Matsedill og bættu við einni
 heiltölu property breytu fyrir heildarverðið. Skrifaðu get-aðferð á heildarverðið.

Ef þú treystir þér til geturðu sett ListChangeListener á heildarverðið sem uppfærist þegar veitingum
er bætt við eða eytt er úr körfu. Þetta er efni úr viku 4.
Annars skaltu skrifa aðferð reiknaHeildarverd á Karfa sem ítrar yfir listann og reiknar heildarverðið.
Nú þegar þú ert búin að setja upp beinagrindina af vinnslunni skaltu skrifa main fall í Karfa klasann
sem gerir lítið prófunarforrit. Hér geturðu notað einfaldan debugger.
  */
public class Karfa extends Matsedill {
    // FIELDS
    private final IntegerProperty heildarVerd = new SimpleIntegerProperty();

    // CONSTRUCTOR
    public Karfa() {
        this.matsedillList = FXCollections.observableArrayList();
        matsedillList.addListener((ListChangeListener<Veiting>) change -> updateVerd());
        updateVerd();
    }

    // METHODS

    private void removeItem(Veiting v){
        if(matsedillList != null){
            matsedillList.remove(v);
            updateVerd();
        }
    }

    private void updateVerd() {
        int total = 0;
        for(Veiting v : matsedillList){
            total += v.getVerd();
        }
        heildarVerd.set(total);
    }

    // GETTERS & SETTERS
    public ObservableList<Veiting> getVeiting() {
        return null;
    }

    public NumberExpression heildarVerdProperty() {
        return null;
    }
}

/*
    // Tester

    public static void main(String[] args) {
        Karfa test = new Karfa();
        Vidskiptavinur testVinur = new Vidskiptavinur("kiddi", "roach", "sæmundargata 21");
        Veiting rettur1 = new Veiting("Súkkulaði", 599);
        String[] sVerd = rettur1.getRettur().split(", ", 2);
        int verd = Integer.parseInt(sVerd[1]);
        System.out.println(verd);
        rettur1.setVerd(verd);
        System.out.println(rettur1.getVerd());
    }
}

 */
