package AtinSirPractice;
@FunctionalInterface
public interface Greeting {

    String greet(String name);
class Geneterated
{

}

interface  ABC {
    String wish(String wishes);
}

}

class XYZ implements Greeting.ABC
{

    @Override
    public String wish(String wishes) {
        return wishes;
    }
    public XYZ last()
    {
     return new XYZ();
    }
}

class Mainer
{
    public static void main(String[] args) {
        XYZ v = new XYZ();
        System.out.println(v.last().wish("BANTAI"));
    }
}