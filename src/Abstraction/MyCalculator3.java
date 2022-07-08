package Abstraction;

public class MyCalculator3 implements Calculator{
    @Override
    public int sum(int a,int b) {
        return a+b+4;
    }

    @Override
    public int diff(int a,int b) {
        return a-b+4;
    }
}
