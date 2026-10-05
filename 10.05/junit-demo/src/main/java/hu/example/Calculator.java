package hu.example;

public class Calculator {
 
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public float div(int a, int b) {
        if(b != 0) {
            return ((float)a / b);
        }
        throw new IllegalArgumentException("Division by zero");
    }
}