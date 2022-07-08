package Abstraction;

public interface Bird {
    public abstract void living();

  public default void name()
   {
       System.out.println("BIRD");
   }
}
