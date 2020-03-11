package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import java.io.IOException;

public class RezultatiController  {

    @FXML
    private Button btnOdjava;

    @FXML
    private Button btnPovratak;

    @FXML
    private PieChart piechart;


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

    public void Rezultati (ActionEvent event){
        ObservableList<Data> list = FXCollections.observableArrayList(
                new PieChart.Data("Geografija izbor", 55),
                new PieChart.Data("Klasicna muzika izbor", 43),
                new PieChart.Data("Povijest izbor", 88),
                new PieChart.Data("Prometni znakovi izbor", 7),
                new PieChart.Data("Zivotinje izbor", 40),
                new PieChart.Data("Hrana izbor", 60)
        );

        piechart.setData(list);

    }

    public void Rezultati2 (ActionEvent event){
        ObservableList<Data> list2 = FXCollections.observableArrayList(
                new PieChart.Data("Geografija t/n",55),
                new PieChart.Data("Klasicna muzika t/n", 35),
                new PieChart.Data("Povijest t/n", 10),
                new PieChart.Data("Prometni znakovi t/n", 45),
                new PieChart.Data("Zivotinje t/n", 32),
                new PieChart.Data("Hrana t/n", 65)
        );

        piechart.setData(list2);

}
}

