package Abstraction;

public class Overall implements Animal,Bird {

    @Override
    public void living() {
        System.out.println("Animal & Bird lives");
    }

    @Override
    public void name() {
        Animal.super.name();
        Bird.super.name();
    }


}
