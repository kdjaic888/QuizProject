package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import java.io.IOException;

public class VrsteProZController {

    @FXML
    private Button btnOdjava;

    @FXML
    private Button btnPovratak;

    public void GoOdjava() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        Parent root = loader.load();
        btnOdjava.getScene().setRoot(root);
    }

    public void GoPovratak() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/PromZnak.fxml"));
        Parent root = loader.load();
        btnPovratak.getScene().setRoot(root);
    }
}
