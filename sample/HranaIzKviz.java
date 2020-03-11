package sample;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class HranaIzKviz {

    static Random rand = new Random();
    static int score = 0;
    static int questionCount = 1;
    static int questionIndex = 0;
    static int questionsCorrect = 0;
    static ArrayList<Button> buttons;
    final static String DELIMITER = ";";

    String question;
    String correct;
    ArrayList<String> wrongs;
    Button randButton;

    public HranaIzKviz(String question, String correct, String wrong1, String wrong2, String wrong3) {
        this.question = question;
        this.correct = correct;
        this.wrongs = new ArrayList<>();
        this.wrongs.add(wrong1);
        this.wrongs.add(wrong2);
        this.wrongs.add(wrong3);
    }

    public static ArrayList<HranaIzKviz> loadQuestions(String filename) {
        ArrayList<HranaIzKviz> questions = new ArrayList<>();

        try {
            Path filePath = Paths.get("./" + filename);
            Files.lines(filePath).forEach(line -> {
                if (line.startsWith("//") || line.isEmpty()) {
                    return;
                }
                String[] tokens = line.split(DELIMITER);
                questions.add(new HranaIzKviz(tokens[0].trim(), tokens[1].trim(), tokens[2].trim(), tokens[3].trim(), tokens[4].trim()));
            });
        } catch (IOException e) {

            Alert notFound = new Alert(Alert.AlertType.ERROR);
            notFound.setTitle("Questions File Error");
            notFound.setHeaderText("Questions file not found!");
            notFound.setContentText("Make sure there is a Hranaiz.txt file in the same directory.");
            notFound.getDialogPane().getStylesheets().add(HranaIzKviz.class.getResource("lightTheme.css").toExternalForm());
            notFound.showAndWait();

            Platform.exit();
            System.exit(0);
        }

        if (questions.isEmpty()) {
            Alert emptyQuestion = new Alert(Alert.AlertType.WARNING);
            emptyQuestion.setTitle("No Questions found");
            emptyQuestion.setHeaderText("No Questions were found in " + filename);
            emptyQuestion.setContentText("Make sure there are questions in " + filename + ".");
            emptyQuestion.getDialogPane().getStylesheets().add(HranaIzKviz.class.getResource("lightTheme.css").toExternalForm());
            emptyQuestion.showAndWait();

            Platform.exit();
            System.exit(0);
        }
        return questions;
    }

    public static void setButtons(Button...buttonsArray) {
        buttons = new ArrayList<>(Arrays.asList(buttonsArray));
    }

    public static int getQuestionIndex() { return questionIndex; }

    public void displayQuestion(Label lbl, Label correctLabel) {

        ArrayList<Button> buttonsCopy = new ArrayList<>(buttons);


        for (Button b : buttonsCopy) {
            b.getStyleClass().remove("correct");
            b.getStyleClass().remove("wrong");
        }

        lbl.setText(this.question);
        correctLabel.setText("Pitanje " + questionCount);

        int randInt = rand.nextInt(4);
        randButton = buttonsCopy.get(randInt);

        buttonsCopy.get(randInt).setText(this.correct);
        buttonsCopy.remove(randInt);

        Collections.shuffle(this.wrongs);
        for (Button b : buttonsCopy) {
            b.setText(this.wrongs.get(buttonsCopy.indexOf(b)));
        }
    }


    public void checkCorrect(Button b, ArrayList<HranaIzKviz> questions, Label scoreLabel) {

        if (this.randButton == b) {
            b.getStyleClass().add("correct");
            b.setStyle("-fx-background-color: #006600;");
            score += 10;
            scoreLabel.setText("Bodovi: " + score);
            questionsCorrect += 1;
        } else {
            b.getStyleClass().add("wrong");
            b.setStyle("-fx-background-color: #660000;");
            this.randButton.getStyleClass().add("correct");
        }

        if (questions.size() == questionCount) {
            HranaIzKvizController.finished(score, questionsCorrect);
        }

        questionCount += 1;
        questionIndex += 1;
    }

}
