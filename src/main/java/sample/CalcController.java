package sample;

public class CalcController {

    private static double firstNumber = 0;
    private static double secondNumber = 0;
    private static int operationFlag = 0;
    private static int resultFlag = 0;

    public void clearVariables(){
        firstNumber = 0;
        secondNumber = 0;
        operationFlag = 0;
        resultFlag = 0;
    }
    public void clearButtonClicked() {
        CalcApp.resultTextArea.setText("0");
        clearVariables();
    }
    public void commaButtonClicked() {
        if(!CalcApp.resultTextArea.getText().contains("."))
            CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + ".");
    }
    public void zeroButtonClicked() {
        if(resultFlag==0) {
            if (!CalcApp.resultTextArea.getText().equals("0"))
                CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "0");
        } else {
            CalcApp.resultTextArea.setText("0");
            clearVariables();
        }
    }
    public void oneButtonClicked() {
        if(resultFlag==0) {
            if (!CalcApp.resultTextArea.getText().equals("0"))
                CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "1");
            else CalcApp.resultTextArea.setText("1");
        } else {
            CalcApp.resultTextArea.setText("1");
            clearVariables();
        }
    }
    public void twoButtonClicked() {
        if(resultFlag==0) {
            if (!CalcApp.resultTextArea.getText().equals("0"))
                CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "2");
            else CalcApp.resultTextArea.setText("2");
        } else {
            CalcApp.resultTextArea.setText("2");
            clearVariables();
        }
    }
    public void threeButtonClicked() {
        if(resultFlag==0) {
            if (!CalcApp.resultTextArea.getText().equals("0"))
                CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "3");
            else CalcApp.resultTextArea.setText("3");
        } else {
            CalcApp.resultTextArea.setText("3");
            clearVariables();
        }
    }
    public void fourButtonClicked() {
        if(resultFlag==0) {
            if (!CalcApp.resultTextArea.getText().equals("0"))
                CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "4");
            else CalcApp.resultTextArea.setText("4");
        } else {
            CalcApp.resultTextArea.setText("4");
            clearVariables();
        }
    }
    public void fiveButtonClicked() {
        if(resultFlag==0) {
            if (!CalcApp.resultTextArea.getText().equals("0"))
                CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "5");
            else CalcApp.resultTextArea.setText("5");
        } else {
            CalcApp.resultTextArea.setText("5");
            clearVariables();
        }
    }
    public void sixButtonClicked() {
        if(resultFlag==0) {
            if (!CalcApp.resultTextArea.getText().equals("0"))
                CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "6");
            else CalcApp.resultTextArea.setText("6");
        } else {
            CalcApp.resultTextArea.setText("6");
            clearVariables();
        }
    }
    public void sevenButtonClicked() {
        if(resultFlag==0) {
            if (!CalcApp.resultTextArea.getText().equals("0"))
                CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "7");
            else CalcApp.resultTextArea.setText("7");
        } else {
            CalcApp.resultTextArea.setText("7");
            clearVariables();
        }
    }
    public void eightButtonClicked() {
        if(resultFlag==0) {
            if (!CalcApp.resultTextArea.getText().equals("0"))
                CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "8");
            else CalcApp.resultTextArea.setText("8");
        } else {
            CalcApp.resultTextArea.setText("8");
            clearVariables();
        }
    }
    public void nineButtonClicked() {
        if(resultFlag==0) {
            if (!CalcApp.resultTextArea.getText().equals("0"))
                CalcApp.resultTextArea.setText(CalcApp.resultTextArea.getText() + "9");
            else CalcApp.resultTextArea.setText("9");
        } else {
            CalcApp.resultTextArea.setText("9");
            clearVariables();
        }
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
        if(resultFlag==0)
            secondNumber = Double.parseDouble(CalcApp.resultTextArea.getText());
        resultFlag = 1;
        switch(operationFlag){
            case 0:
                firstNumber =  Double.parseDouble(CalcApp.resultTextArea.getText());
                break;
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
