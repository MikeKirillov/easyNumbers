package JavaCore.Module09;

public class Calculator {
    double result = 5;

    public void getResult() {
        result = Math.pow(result, 2);// 25
        result = result + 25;// 50
        result = result / 3;// 16.67
        result = Math.round(result);// 17

        System.out.println(result);
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.getResult();// need to return result = 17
    }
}