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
import java.sql.*;

public class PovKalController {

    @FXML
    private Button btnOdjava;

    @FXML
    private Button btnPovratak;

    @FXML  Button btnSijecanj;

    @FXML  Button btnVeljaca;

    @FXML  Button btnOzujak;

    @FXML  Button btnTravanj;

    @FXML  Button btnSvibanj;

    @FXML  Button btnLipanj;

    @FXML  Button btnSrpanj;

    @FXML  Button btnKolovoz;

    @FXML  Button btnRujan;

    @FXML  Button btnListopad;

    @FXML  Button btnStudeni;

    @FXML  Button btnProsinac;

    private ObservableList<PovKal> PovKalList;

    @FXML
    TableView<PovKal> povkal = new TableView<>();

    @FXML
    TableColumn<PovKal, String> datum = new TableColumn<>();

    @FXML
    TableColumn<PovKal, String> dogadjaj = new TableColumn<>();


    public void GoOdjava() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        Parent root = loader.load();
        btnOdjava.getScene().setRoot(root);
    }

    public void GoPovratak() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Povijest.fxml"));
        Parent root = loader.load();
        btnPovratak.getScene().setRoot(root);
    }

    public void prikaziSijecanj(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Sijecanj'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));


        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
}

    public void prikaziVeljaca(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Veljaca'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }

    public void prikaziOzujak(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Ozujak'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }

    public void prikaziTravanj(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Travanj'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }

    public void prikaziSvibanj(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Svibanj'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }

    public void prikaziLipanj(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Lipanj'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }

    public void prikaziSrpanj(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Srpanj'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }

    public void prikaziKolovoz(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Kolovoz'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }

    public void prikaziRujan(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Rujan'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }

    public void prikaziListopad(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Listopad'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }

    public void prikaziStudeni(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Studeni'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }

    public void prikaziProsinac(){

        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select datum, dogadjaj from Mjeseci where ime='Prosinac'");
            rs = ps.executeQuery();

            PovKalList = FXCollections.observableArrayList();

            while (rs.next()) {

                String datum = rs.getString("datum");
                String dogadjaj = rs.getString("dogadjaj");


                PovKalList.add(new PovKal(datum, dogadjaj));

            }

        } catch (Exception e) {
        }

        datum.setCellValueFactory(new PropertyValueFactory<>("datum"));
        dogadjaj.setCellValueFactory(new PropertyValueFactory<>("dogadjaj"));



        datum.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDatum()));});
        dogadjaj.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((PovKal)cellData.getValue()).getDogadjaj()));});

        povkal.setItems(PovKalList);
        povkal.refresh();
    }
}
