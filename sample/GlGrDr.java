package sample;

import javafx.beans.property.SimpleStringProperty;

public class GlGrDr {

    private SimpleStringProperty glgrad, drzava;

    public GlGrDr(String glgrad, String drzava){
        this.glgrad = new SimpleStringProperty(glgrad);
        this.drzava =new SimpleStringProperty(drzava);
    }

    public String getGlGr() {
        return glgrad.get();
    }


    public String getDrzava() {
        return drzava.get();
    }

}
