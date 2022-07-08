package Abstraction;

public class Rbc extends Bank{
    @Override
    public int calculateInterest() {
        System.out.println("RBC CALCULATE INTEREST");
        return 0;
    }

    @Override
    public int calculateInterest1(int a) {
        System.out.println("RBC CALCULATE INTEREST1");
        return 10;
    }

    @Override
    public float calculateInterest2(float b) {
        System.out.println("RBC CALCULATE INTEREST2");
        return 20;
    }
}
