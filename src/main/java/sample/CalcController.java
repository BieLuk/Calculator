package sample;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CalcController {

    static double firstNumber = 0;
    static double secondNumber = 0;
    static int operationFlag = 0;


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
    public void commaButtonClicked() {
        if(!CalcApp.resultTextArea.getText().contains("."))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + ".");
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
        firstNumber = Double.parseDouble(CalcApp.resultTextArea.getText());
        CalcApp.resultTextArea.setText("0");
        operationFlag = 1;
    }
    public void subButtonClicked(){
        firstNumber = Double.parseDouble(CalcApp.resultTextArea.getText());
        CalcApp.resultTextArea.setText("0");
        operationFlag = 2;
    }
    public void mulButtonClicked(){
        firstNumber = Double.parseDouble(CalcApp.resultTextArea.getText());
        CalcApp.resultTextArea.setText("0");
        operationFlag = 3;
    }
    public void divButtonClicked(){
        firstNumber = Double.parseDouble(CalcApp.resultTextArea.getText());
        CalcApp.resultTextArea.setText("0");
        operationFlag = 4;
    }
    public void resultButtonClicked(){
        secondNumber = Double.parseDouble(CalcApp.resultTextArea.getText());
        switch(operationFlag){
            case 1:
                firstNumber = firstNumber + secondNumber;
                break;
            case 2:
                firstNumber = firstNumber - secondNumber;
                break;
            case 3:
                firstNumber = firstNumber * secondNumber;
                break;
            case 4:
                firstNumber = firstNumber / secondNumber;
                break;
        }
        CalcApp.resultTextArea.setText(""+firstNumber);
    }


}
