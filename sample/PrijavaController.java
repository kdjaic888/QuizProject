package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class PrijavaController implements Initializable{

    @FXML TextField txtKorisnickoIme;

    @FXML PasswordField txtLozinka;

    @FXML Button btnPrijava;

    @FXML Label lblGreska;

    @FXML Button btnRegistrirajSe;

    @FXML Label proba;

    public PrijavaModel prijavaModel = new PrijavaModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (prijavaModel.isClosed()) {
            proba.setVisible(false);
            proba.setText("radi");
        } else {
            proba.setText("Niste spojeni s bazom podataka");
        }
    }

    public void registrirajSe() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Registracija.fxml"));
        Parent root = loader.load();
        btnRegistrirajSe.getScene().setRoot(root);
    }

    public void prijava() throws Exception {
        try {
            if (prijavaModel.isLogin(txtKorisnickoIme.getText(), txtLozinka.getText())) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Pocetna.fxml"));
                Parent root = loader.load();
                btnPrijava.getScene().setRoot(root);
            } else {
                lblGreska.setVisible(true);
                lblGreska.setText("Krivo korisnicko ime ili lozinka");
            }
        } catch (SQLException e) {
            lblGreska.setText("SQL greska");
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
