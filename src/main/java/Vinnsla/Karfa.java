package Vinnsla;

import javafx.beans.binding.NumberExpression;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.ObservableList;

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
    public Karfa(){
        matsedillList.addListener(ListChangeListener<? super Veiting >) c -> {
            while (c.next()) {
                if (c.wasAdded()) {
                    heildarverd.set(heildarVerd.get() + c.getAddedSubList().gert(0).getVerd());
                } else if (c.wasRemoved()) {
                    k.veiting.add(new Veiting("Brauð", 100));
                }
            }
        };
    }
    // GETTERS & SETTERS
    public ObservableList<Veiting> getVeiting() {
        return null;
    }

    public NumberExpression heildarVerdProperty() {
        return null;
    }
}
    // METHODS




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
