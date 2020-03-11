package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class GlGradDrzController {

    @FXML  Button btnPovratak;

    @FXML  Button btnOdjava;

    @FXML  Button btnGlGradDrz;

    private ObservableList<GlGrDr> GlGrDrzList;

    @FXML
    TableView<GlGrDr> Glgrddrz = new TableView<>();
    @FXML
    TableColumn<GlGrDr, String> glgrad = new TableColumn<>();
    @FXML
    TableColumn<GlGrDr, String> drzava = new TableColumn<>();


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

    public void PrikaziGlGradDrz(){
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select * from GlGradDrzave");
            rs = ps.executeQuery();

            GlGrDrzList = FXCollections.observableArrayList();

            while (rs.next()) {

            String glgrad = rs.getString("GlGrad");
            String drzava = rs.getString("Drzava");

            GlGrDrzList.add(new GlGrDr(glgrad, drzava));

            }

        } catch (Exception e) {
    }
        glgrad.setCellValueFactory(new PropertyValueFactory<>("GlGrad"));
        drzava.setCellValueFactory(new PropertyValueFactory<>("Drzava"));


        glgrad.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((GlGrDr)cellData.getValue()).getGlGr()));});
        drzava.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((GlGrDr)cellData.getValue()).getDrzava()));});


        Glgrddrz.setItems(GlGrDrzList);
        Glgrddrz.refresh();
    }


}
