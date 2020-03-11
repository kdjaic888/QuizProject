package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class PovijestController {

    @FXML
    private Button btnOdjava;

    @FXML
    private Button btnPovratak;

    @FXML
    private Button btnPozPov;

    @FXML
    private Button btnPovKal;

    @FXML
    private Button btnToNe;

    @FXML
    private Button btnVisIzb;


    public void GoOdjava() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        Parent root = loader.load();
        btnOdjava.getScene().setRoot(root);
    }

    public void GoPovratak() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Pocetna.fxml"));
        Parent root = loader.load();
        btnPovratak.getScene().setRoot(root);
    }

    public void GoPozPov() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/PozPov.fxml"));
        Parent root = loader.load();
        btnPozPov.getScene().setRoot(root);
    }

    public void GoPovKal() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/PovKal.fxml"));
        Parent root = loader.load();
        btnPovKal.getScene().setRoot(root);
    }

    public void GoToNe() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/PovijestPrijeKK.fxml"));
        Parent root = loader.load();
        btnToNe.getScene().setRoot(root);
    }

    public void GoVisIz() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/PovijestPrijeK.fxml"));
        Parent root = loader.load();
        btnVisIzb.getScene().setRoot(root);
    }
}
