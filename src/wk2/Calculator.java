package wk2;

public class Calculator {

    //number1
    //number2
    //operator


    //fields in C# are called Instance Variables in Java
    //_name
    private String number1, number2;
    private char operator;
    private double num1, num2, result;

    public Calculator() {
        this("1", '+', "2");
    }

    public Calculator(String number1, char operator, String number2) {
        setNum1(number1);
        setOperator(operator);
        setNum2(number2);
        setResult();
    }
    public Calculator(String number1, String number2, char operator) {
        this(number1, operator, number2);
    }
    private boolean isValidNumber(String number) {

        for (int i = 0; i < number.length(); i++) {
            if(Character.isDigit(number.charAt(i))
                    || number.charAt(i) == '-'
                    || number.charAt(i) == '+'
                    || number.charAt(i) == '.'
            ) {}
            else{
                return false;
            }
        }
        return true;
    }
    private void setNum1(String number1) {

    if(isValidNumber(number1)){
        this.num1 = Double.parseDouble(number1);
    }

    }
    private void setNum2(String number2) {
        if(isValidNumber(number2)){
            num2 = Double.parseDouble(number2);
        }
    }

    private void setOperator(char operator) {

        if(operator == '+' || operator == '-' || operator == '*' || operator == '/'){
            this.operator = operator;
        }
        else this.operator = '+';
    }

    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }
    public char getOperator(){
        return operator;
    }
    private void setResult(){
        this.result = switch (this.operator){
          case '-' -> num1 - num2;
          case '*' -> num1 * num2;
          case '/' -> num1 / num2;
          default -> num1 + num2;
        };
    }
    public double getResult(){
        return result;
    }
}
