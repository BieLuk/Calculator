package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class CalcApp extends Application {
    static TextArea resultTextArea;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/calc.fxml"));
        Scene scene = new Scene(root);
        resultTextArea = (TextArea) root.lookup("#resultTextArea");
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        scene.getStylesheets().add("layout.css");
        primaryStage.show();
    }


public static void main(String[] args) {
        launch(args);
        }
        }
