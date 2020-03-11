package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;

public class HranaController {

    @FXML
    private Button btnOdjava;

    @FXML
    private Button btnPovratak;

    @FXML
    private Button btnNuVrij;

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

    public void GoNuVrij() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/NutritivneVrijednosti.fxml"));
        Parent root = loader.load();
        btnNuVrij.getScene().setRoot(root);
    }

    public void GoToNe() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/HranaPrijeKK.fxml"));
        Parent root = loader.load();
        btnToNe.getScene().setRoot(root);
    }

    public void GoVisIz() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/HranaPrijeK.fxml"));
        Parent root = loader.load();
        btnVisIzb.getScene().setRoot(root);
    }
}
