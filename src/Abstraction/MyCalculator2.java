package Abstraction;

public class MyCalculator2 implements  Calculator{
    @Override
    public int sum(int a,int b) {
        return a+b+2;
    }

    @Override
    public int diff(int a,int b) {
        return a-b+2;
    }
}
