package AtinSirPractice;

public class NewMain {
    public static void main(String[] args) {
        b obj = (a,b) -> a > b ?a:b;
        System.out.println(obj.pass(5, 6));
    }
}

interface b{
    int pass(int a,int b);
}