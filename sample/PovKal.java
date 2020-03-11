package sample;

import javafx.beans.property.SimpleStringProperty;

public class PovKal {

    private SimpleStringProperty datum, dogadjaj;

    public PovKal(String datum, String dogadjaj){
        this.datum =new SimpleStringProperty(datum);
        this.dogadjaj =new SimpleStringProperty(dogadjaj);
    }


    public String getDatum() {
        return datum.get();
    }


    public String getDogadjaj() {
        return dogadjaj.get();
    }

}
