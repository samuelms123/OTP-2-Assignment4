package calculator;

public class Calculator {

    private Calculator() {
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double dividend, double divisor) {
        return dividend / divisor;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

}