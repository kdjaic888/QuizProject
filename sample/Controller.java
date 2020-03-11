package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import java.io.IOException;

public class Controller {

    @FXML
    private Button btnPrijava;

    @FXML
    private Button btnRegistracija;


    public void GoPrijava() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Prijava.fxml"));
        Parent root = loader.load();
        btnPrijava.getScene().setRoot(root);
    }

    public void GoRegistracija() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Registracija.fxml"));
        Parent root = loader.load();
        btnRegistracija.getScene().setRoot(root);
    }


}
