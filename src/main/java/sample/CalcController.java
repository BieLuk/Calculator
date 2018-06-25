package sample;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CalcController {

    static String first;

    public void initialize(URL location, ResourceBundle resources) {
        FXMLLoader loader = new FXMLLoader();
        loader.setResources(resources);

        try {
            AnchorPane pane = loader.load(getClass().getResource("/calc.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void clearButtonClicked() {
        CalcApp.resultTextArea.setText("0");
    }
    public void comaButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals(""))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "0");
    }
    public void zeroButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals("0"))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "0");
    }
    public void oneButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals("0"))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "1");
        else CalcApp.resultTextArea.setText("1");
    }
    public void twoButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals("0"))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "2");
        else CalcApp.resultTextArea.setText("2");
    }
    public void threeButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals("0"))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "3");
        else CalcApp.resultTextArea.setText("3");
    }
    public void fourButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals("0"))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "4");
        else CalcApp.resultTextArea.setText("4");
    }
    public void fiveButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals("0"))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "5");
        else CalcApp.resultTextArea.setText("5");
    }
    public void sixButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals("0"))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "6");
        else CalcApp.resultTextArea.setText("6");
    }
    public void sevenButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals("0"))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "7");
        else CalcApp.resultTextArea.setText("7");
    }
    public void eightButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals("0"))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "8");
        else CalcApp.resultTextArea.setText("8");
    }
    public void nineButtonClicked() {
        if(!CalcApp.resultTextArea.getText().equals("0"))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "9");
        else CalcApp.resultTextArea.setText("9");
    }

    public void addButtonClicked(){

    }


}
