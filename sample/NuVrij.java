package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class NuVrij {

    private SimpleStringProperty ime;
    private SimpleIntegerProperty kalorije, proteini, ugljik, masti;

    public NuVrij(String ime, int kalorije, int proteini, int ugljik, int masti){
        this.ime =new SimpleStringProperty(ime);
        this.kalorije = new SimpleIntegerProperty(kalorije);
        this.proteini = new SimpleIntegerProperty(proteini);
        this.ugljik = new SimpleIntegerProperty(ugljik);
        this.masti = new SimpleIntegerProperty(masti);

    }

    public String getIme() {
        return ime.get();
    }


    public int getKalorije() {
        return kalorije.get();
    }

    public int getProteini() {
        return proteini.get();
    }

    public int getUgljik() {
        return ugljik.get();
    }

    public int getMasti() {
        return masti.get();
    }
}
