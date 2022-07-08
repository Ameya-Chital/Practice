package Abstraction;

public class MyCalculator1 implements Calculator {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int diff(int a,int b) {
        return a-b;
    }
}
