package sample;

import javafx.fxml.FXML;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class ZivTNKvizController {

    @FXML
    private Label questionLabel;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Label questionNum;

    @FXML
    private Label scoreLabel;

    static ArrayList<ZivTNKviz> questions;
    static int percent;
    static int pauseValue = 1500;

    @FXML
    void initialize() {
        questions = ZivTNKviz.loadQuestions("./Zivotinjetn.txt");

        ZivTNKviz.setButtons(button1, button2);

        questions.get(ZivTNKviz.getQuestionIndex()).displayQuestion(questionLabel, questionNum);

        button1.setOnAction(this::handleButtonAction);
        button2.setOnAction(this::handleButtonAction);
    }


    private void handleButtonAction(ActionEvent event) {

        button1.setDisable(true);
        button2.setDisable(true);

        questions.get(ZivTNKviz.getQuestionIndex()).checkCorrect((Button) event.getTarget(), questions, scoreLabel);

        Timer time = new Timer();
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    questions.get(ZivTNKviz.getQuestionIndex()).displayQuestion(questionLabel, questionNum);
                    button1.setDisable(false);
                    button2.setDisable(false);
                }); } }, pauseValue); }


    public static void finished(int score, int questionsCorrect) {
        if (questionsCorrect == 0) { percent = 0; }
        else { percent = (int) ((double)questionsCorrect/(double)questions.size() * 100); }

        Alert finish = new Alert(Alert.AlertType.INFORMATION);
        finish.setTitle("Čestitamo!");
        finish.setHeaderText("Rezultat: " + score);
        finish.setContentText("Točno ste odgovorili na: " + questionsCorrect + " od " + questions.size() + " (" + percent + "%)");
        finish.getDialogPane().getStylesheets().add(ZivTNKviz.class.getResource("lightTheme.css").toExternalForm());
        finish.showAndWait();

        Platform.exit();
        System.exit(0);
    }
}
