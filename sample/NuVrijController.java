package sample;

import javafx.beans.property.SimpleIntegerProperty;
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

public class NuVrijController {

    @FXML  Button btnPovratak;

    @FXML  Button btnOdjava;

    @FXML  Button btnJaja;

    @FXML  Button btnMlijeko;

    @FXML  Button btnKrumpir;

    @FXML  Button btnPovrce;

    @FXML  Button btnMasnoce;

    @FXML  Button btnRiba;

    @FXML  Button btnMeso;

    @FXML  Button btnVoce;

    @FXML  Button btnZitarice;

    private ObservableList<NuVrij> NuVrijList;

    @FXML
    TableView<NuVrij> nuvrij = new TableView<>();

    @FXML
    TableColumn<NuVrij, String> ime = new TableColumn<>();

    @FXML
    TableColumn<NuVrij, Integer> kalorije = new TableColumn<>();
    @FXML
    TableColumn<NuVrij, Integer> proteini = new TableColumn<>();

    @FXML
    TableColumn<NuVrij, Integer> ugljik = new TableColumn<>();
    @FXML
    TableColumn<NuVrij, Integer> masti = new TableColumn<>();


    public void GoOdjava() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        Parent root = loader.load();
        btnOdjava.getScene().setRoot(root);
    }


    public void GoPovratak() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Hrana.fxml"));
        Parent root = loader.load();
        btnPovratak.getScene().setRoot(root);
    }


    public void GoJaja(){
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select ime, kalorije, proteini, ugljikohidrati, masti from NutritivneVrijednosti where vrsta='Jaja'");
            rs = ps.executeQuery();

            NuVrijList = FXCollections.observableArrayList();

            while (rs.next()) {

                String ime = rs.getString("ime");
                int kalorije = rs.getInt("kalorije");
                int proteini = rs.getInt("proteini");
                int ugljik = rs.getInt("ugljikohidrati");
                int masti = rs.getInt("masti");

                NuVrijList.add(new NuVrij(ime, kalorije, proteini, ugljik, masti));

            }

        } catch (Exception e) {
        }

        ime.setCellValueFactory(new PropertyValueFactory<>("ime"));
        kalorije.setCellValueFactory(new PropertyValueFactory<>("kalorije"));
        proteini.setCellValueFactory(new PropertyValueFactory<>("proteini"));
        ugljik.setCellValueFactory(new PropertyValueFactory<>("ugljikohidrati"));
        masti.setCellValueFactory(new PropertyValueFactory<>("masti"));


        ime.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((NuVrij)cellData.getValue()).getIme()));});
        kalorije.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getKalorije())).asObject();});
        proteini.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getProteini())).asObject();});
        ugljik.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getUgljik())).asObject();});
        masti.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getMasti())).asObject();});

        nuvrij.setItems(NuVrijList);
        nuvrij.refresh();
    }

    public void GoMlijeko(){
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select ime, kalorije, proteini, ugljikohidrati, masti from NutritivneVrijednosti where vrsta='Mlijeko'");
            rs = ps.executeQuery();

            NuVrijList = FXCollections.observableArrayList();

            while (rs.next()) {

                String ime = rs.getString("ime");
                int kalorije = rs.getInt("kalorije");
                int proteini = rs.getInt("proteini");
                int ugljik = rs.getInt("ugljikohidrati");
                int masti = rs.getInt("masti");

                NuVrijList.add(new NuVrij(ime, kalorije, proteini, ugljik, masti));

            }

        } catch (Exception e) {
        }

        ime.setCellValueFactory(new PropertyValueFactory<>("ime"));
        kalorije.setCellValueFactory(new PropertyValueFactory<>("kalorije"));
        proteini.setCellValueFactory(new PropertyValueFactory<>("proteini"));
        ugljik.setCellValueFactory(new PropertyValueFactory<>("ugljikohidrati"));
        masti.setCellValueFactory(new PropertyValueFactory<>("masti"));


        ime.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((NuVrij)cellData.getValue()).getIme()));});
        kalorije.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getKalorije())).asObject();});
        proteini.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getProteini())).asObject();});
        ugljik.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getUgljik())).asObject();});
        masti.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getMasti())).asObject();});

        nuvrij.setItems(NuVrijList);
        nuvrij.refresh();
    }

    public void GoKrumpir(){
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select ime, kalorije, proteini, ugljikohidrati, masti from NutritivneVrijednosti where vrsta='Krumpir'");
            rs = ps.executeQuery();

            NuVrijList = FXCollections.observableArrayList();

            while (rs.next()) {

                String ime = rs.getString("ime");
                int kalorije = rs.getInt("kalorije");
                int proteini = rs.getInt("proteini");
                int ugljik = rs.getInt("ugljikohidrati");
                int masti = rs.getInt("masti");

                NuVrijList.add(new NuVrij(ime, kalorije, proteini, ugljik, masti));

            }

        } catch (Exception e) {
        }

        ime.setCellValueFactory(new PropertyValueFactory<>("ime"));
        kalorije.setCellValueFactory(new PropertyValueFactory<>("kalorije"));
        proteini.setCellValueFactory(new PropertyValueFactory<>("proteini"));
        ugljik.setCellValueFactory(new PropertyValueFactory<>("ugljikohidrati"));
        masti.setCellValueFactory(new PropertyValueFactory<>("masti"));


        ime.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((NuVrij)cellData.getValue()).getIme()));});
        kalorije.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getKalorije())).asObject();});
        proteini.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getProteini())).asObject();});
        ugljik.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getUgljik())).asObject();});
        masti.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getMasti())).asObject();});

        nuvrij.setItems(NuVrijList);
        nuvrij.refresh();
    }

    public void GoPovrce(){
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select ime, kalorije, proteini, ugljikohidrati, masti from NutritivneVrijednosti where vrsta='Povrce'");
            rs = ps.executeQuery();

            NuVrijList = FXCollections.observableArrayList();

            while (rs.next()) {

                String ime = rs.getString("ime");
                int kalorije = rs.getInt("kalorije");
                int proteini = rs.getInt("proteini");
                int ugljik = rs.getInt("ugljikohidrati");
                int masti = rs.getInt("masti");

                NuVrijList.add(new NuVrij(ime, kalorije, proteini, ugljik, masti));

            }

        } catch (Exception e) {
        }

        ime.setCellValueFactory(new PropertyValueFactory<>("ime"));
        kalorije.setCellValueFactory(new PropertyValueFactory<>("kalorije"));
        proteini.setCellValueFactory(new PropertyValueFactory<>("proteini"));
        ugljik.setCellValueFactory(new PropertyValueFactory<>("ugljikohidrati"));
        masti.setCellValueFactory(new PropertyValueFactory<>("masti"));


        ime.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((NuVrij)cellData.getValue()).getIme()));});
        kalorije.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getKalorije())).asObject();});
        proteini.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getProteini())).asObject();});
        ugljik.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getUgljik())).asObject();});
        masti.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getMasti())).asObject();});

        nuvrij.setItems(NuVrijList);
        nuvrij.refresh();
    }

    public void GoMasnoce(){
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select ime, kalorije, proteini, ugljikohidrati, masti from NutritivneVrijednosti where vrsta='Masnoce'");
            rs = ps.executeQuery();

            NuVrijList = FXCollections.observableArrayList();

            while (rs.next()) {

                String ime = rs.getString("ime");
                int kalorije = rs.getInt("kalorije");
                int proteini = rs.getInt("proteini");
                int ugljik = rs.getInt("ugljikohidrati");
                int masti = rs.getInt("masti");

                NuVrijList.add(new NuVrij(ime, kalorije, proteini, ugljik, masti));

            }

        } catch (Exception e) {
        }

        ime.setCellValueFactory(new PropertyValueFactory<>("ime"));
        kalorije.setCellValueFactory(new PropertyValueFactory<>("kalorije"));
        proteini.setCellValueFactory(new PropertyValueFactory<>("proteini"));
        ugljik.setCellValueFactory(new PropertyValueFactory<>("ugljikohidrati"));
        masti.setCellValueFactory(new PropertyValueFactory<>("masti"));


        ime.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((NuVrij)cellData.getValue()).getIme()));});
        kalorije.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getKalorije())).asObject();});
        proteini.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getProteini())).asObject();});
        ugljik.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getUgljik())).asObject();});
        masti.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getMasti())).asObject();});

        nuvrij.setItems(NuVrijList);
        nuvrij.refresh();
    }

    public void GoRiba(){
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select ime, kalorije, proteini, ugljikohidrati, masti from NutritivneVrijednosti where vrsta='Riba'");
            rs = ps.executeQuery();

            NuVrijList = FXCollections.observableArrayList();

            while (rs.next()) {

                String ime = rs.getString("ime");
                int kalorije = rs.getInt("kalorije");
                int proteini = rs.getInt("proteini");
                int ugljik = rs.getInt("ugljikohidrati");
                int masti = rs.getInt("masti");

                NuVrijList.add(new NuVrij(ime, kalorije, proteini, ugljik, masti));

            }

        } catch (Exception e) {
        }

        ime.setCellValueFactory(new PropertyValueFactory<>("ime"));
        kalorije.setCellValueFactory(new PropertyValueFactory<>("kalorije"));
        proteini.setCellValueFactory(new PropertyValueFactory<>("proteini"));
        ugljik.setCellValueFactory(new PropertyValueFactory<>("ugljikohidrati"));
        masti.setCellValueFactory(new PropertyValueFactory<>("masti"));


        ime.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((NuVrij)cellData.getValue()).getIme()));});
        kalorije.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getKalorije())).asObject();});
        proteini.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getProteini())).asObject();});
        ugljik.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getUgljik())).asObject();});
        masti.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getMasti())).asObject();});

        nuvrij.setItems(NuVrijList);
        nuvrij.refresh();
    }

    public void GoMeso(){
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select ime, kalorije, proteini, ugljikohidrati, masti from NutritivneVrijednosti where vrsta='Meso'");
            rs = ps.executeQuery();

            NuVrijList = FXCollections.observableArrayList();

            while (rs.next()) {

                String ime = rs.getString("ime");
                int kalorije = rs.getInt("kalorije");
                int proteini = rs.getInt("proteini");
                int ugljik = rs.getInt("ugljikohidrati");
                int masti = rs.getInt("masti");

                NuVrijList.add(new NuVrij(ime, kalorije, proteini, ugljik, masti));

            }

        } catch (Exception e) {
        }

        ime.setCellValueFactory(new PropertyValueFactory<>("ime"));
        kalorije.setCellValueFactory(new PropertyValueFactory<>("kalorije"));
        proteini.setCellValueFactory(new PropertyValueFactory<>("proteini"));
        ugljik.setCellValueFactory(new PropertyValueFactory<>("ugljikohidrati"));
        masti.setCellValueFactory(new PropertyValueFactory<>("masti"));


        ime.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((NuVrij)cellData.getValue()).getIme()));});
        kalorije.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getKalorije())).asObject();});
        proteini.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getProteini())).asObject();});
        ugljik.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getUgljik())).asObject();});
        masti.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getMasti())).asObject();});

        nuvrij.setItems(NuVrijList);
        nuvrij.refresh();
    }

    public void GoVoce(){
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select ime, kalorije, proteini, ugljikohidrati, masti from NutritivneVrijednosti where vrsta='Voce'");
            rs = ps.executeQuery();

            NuVrijList = FXCollections.observableArrayList();

            while (rs.next()) {

                String ime = rs.getString("ime");
                int kalorije = rs.getInt("kalorije");
                int proteini = rs.getInt("proteini");
                int ugljik = rs.getInt("ugljikohidrati");
                int masti = rs.getInt("masti");

                NuVrijList.add(new NuVrij(ime, kalorije, proteini, ugljik, masti));

            }

        } catch (Exception e) {
        }

        ime.setCellValueFactory(new PropertyValueFactory<>("ime"));
        kalorije.setCellValueFactory(new PropertyValueFactory<>("kalorije"));
        proteini.setCellValueFactory(new PropertyValueFactory<>("proteini"));
        ugljik.setCellValueFactory(new PropertyValueFactory<>("ugljikohidrati"));
        masti.setCellValueFactory(new PropertyValueFactory<>("masti"));


        ime.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((NuVrij)cellData.getValue()).getIme()));});
        kalorije.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getKalorije())).asObject();});
        proteini.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getProteini())).asObject();});
        ugljik.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getUgljik())).asObject();});
        masti.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getMasti())).asObject();});

        nuvrij.setItems(NuVrijList);
        nuvrij.refresh();
    }

    public void GoZitarice(){
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select ime, kalorije, proteini, ugljikohidrati, masti from NutritivneVrijednosti where vrsta='Zitarice'");
            rs = ps.executeQuery();

            NuVrijList = FXCollections.observableArrayList();

            while (rs.next()) {

                String ime = rs.getString("ime");
                int kalorije = rs.getInt("kalorije");
                int proteini = rs.getInt("proteini");
                int ugljik = rs.getInt("ugljikohidrati");
                int masti = rs.getInt("masti");

                NuVrijList.add(new NuVrij(ime, kalorije, proteini, ugljik, masti));

            }

        } catch (Exception e) {
        }

        ime.setCellValueFactory(new PropertyValueFactory<>("ime"));
        kalorije.setCellValueFactory(new PropertyValueFactory<>("kalorije"));
        proteini.setCellValueFactory(new PropertyValueFactory<>("proteini"));
        ugljik.setCellValueFactory(new PropertyValueFactory<>("ugljikohidrati"));
        masti.setCellValueFactory(new PropertyValueFactory<>("masti"));


        ime.setCellValueFactory(cellData -> { return (new SimpleStringProperty(((NuVrij)cellData.getValue()).getIme()));});
        kalorije.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getKalorije())).asObject();});
        proteini.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getProteini())).asObject();});
        ugljik.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getUgljik())).asObject();});
        masti.setCellValueFactory(cellData -> { return (new SimpleIntegerProperty(((NuVrij)cellData.getValue()).getMasti())).asObject();});

        nuvrij.setItems(NuVrijList);
        nuvrij.refresh();
    }


}
