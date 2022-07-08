package Abstraction;

public interface Animal {
    public  abstract void living();

    public default void name()
    {
        System.out.println("ANIMAL");
    }
}
