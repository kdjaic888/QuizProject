package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class PocetnaController {


    @FXML
    private Button btnOdjava;

    @FXML
    private Button btnGeo;

    @FXML
    private Button btnPov;

    @FXML
    private Button btnKlasMuz;

    @FXML
    private Button btnHrana;

    @FXML
    private Button btnPravila;

    @FXML
    private Button btnPromZnak;

    @FXML
    private Button btnZiv;

    @FXML
    private Button btnRezultati;



    public void GoOdjava() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        Parent root = loader.load();
        btnOdjava.getScene().setRoot(root);
    }

    public void GoGeografija() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Geografija.fxml"));
        Parent root = loader.load();
        btnGeo.getScene().setRoot(root);
    }

    public void GoPovijest() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Povijest.fxml"));
        Parent root = loader.load();
        btnPov.getScene().setRoot(root);
    }

    public void GoKlasMuz() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/KlasMuzika.fxml"));
        Parent root = loader.load();
        btnKlasMuz.getScene().setRoot(root);
    }

    public void GoHrana() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Hrana.fxml"));
        Parent root = loader.load();
        btnHrana.getScene().setRoot(root);
    }

    public void GoPravila() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Pravila.fxml"));
        Parent root = loader.load();
        btnPravila.getScene().setRoot(root);
    }

    public void GoPromZnak() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/PromZnak.fxml"));
        Parent root = loader.load();
        btnPromZnak.getScene().setRoot(root);
    }

    public void GoZivotinje() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Zivotinje.fxml"));
        Parent root = loader.load();
        btnZiv.getScene().setRoot(root);
    }

    public void GoRezultati() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Rezultati.fxml"));
        Parent root = loader.load();
        btnRezultati.getScene().setRoot(root);
    }

}
