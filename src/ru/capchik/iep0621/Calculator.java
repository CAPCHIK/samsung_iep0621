package ru.capchik.iep0621;

public class Calculator {
    private int current;

    public Calculator() {
    }

    public Calculator(int startValue) {
        current = startValue;
    }

    public int sum(int arg) {
        current += arg;
        return current;
    }
    public int getCurrent() {
        return current;
    }
}
