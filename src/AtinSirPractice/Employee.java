package AtinSirPractice;

public class Employee implements Work,Iplay {


    @Override
    public void play() {
        System.out.println("I like playing");
    }

    @Override
    public void work() {
        System.out.println("I like working");
    }
}

