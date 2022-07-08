package EverythingInheritance;

import java.util.*;

public class ManagerMain {
    public static void main(String[] args) {
        List<Perform> all = getAll();
//        all.stream().;
//        for (Perform performer: all)
//        {
//            performer.perform();
//        }

       }

    public static List<Perform> getAll()
    {
        List<Perform> p = new ArrayList<>();
        Cooking c = new Cooking();
        Singing s = new Singing();
        Dancing d = new Dancing();
        p.add(c);
        p.add(s);
        p.add(d);
        return p;
    }
}
