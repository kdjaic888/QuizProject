package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import java.io.IOException;


public class GeoPrijeK {


    @FXML  Button btnPovratak;

    @FXML  Button btnOdjava;

    @FXML  Button btnZapocnite;

    public void GoOdjava() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        Parent root = loader.load();
        btnOdjava.getScene().setRoot(root);
    }


    public void GoPovratak() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Geografija.fxml"));
        Parent root = loader.load();
        btnPovratak.getScene().setRoot(root);
    }


    public void GoZapocnite() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/GeoIzKviz.fxml"));
        Parent root = loader.load();
        btnZapocnite.getScene().setRoot(root);
    }
}
