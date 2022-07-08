package Abstraction;

public class Td extends Bank {
    @Override
    public int calculateInterest() {
        System.out.println("TD CALCULATE INTEREST");
        return 0;
    }

    @Override
    public int calculateInterest1(int a) {
        System.out.println("TD CALCULATE INTEREST1");
        return 0;
    }

    @Override
    public float calculateInterest2(float b) {
        System.out.println("TD CALCULATE INTEREST2");
        return 0;
    }
}
