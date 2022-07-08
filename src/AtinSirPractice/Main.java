package AtinSirPractice;

public class Main {
    public static void main(String[] args) {
ShirtProducer obj = new ShirtProducer();
        System.out.println(obj.getShirt(Size.M, "Red"));
    }
}

enum Size
{
    S("SMALL"),M("MEDIUM"),L("LARGE"),XL("XTRA LARGE");

    Size(String s) {
    }
}

class ShirtProducer
{
public Shirt getShirt(Size size, String color)
{
return new Shirt(size,color);
}
}
class Shirt
{
    private Size size;
    private String color;

    public Shirt(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}