package Java.Collections.Comparater;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class DemoProgram1 {
    public static void main(String[] args) {
        TreeSet<Integer> hs=new TreeSet<>(new Comparater1());
        hs.add(3);
        hs.add(34);
        hs.add(5);
        hs.add(10);
        System.out.println(hs);
    }
}
