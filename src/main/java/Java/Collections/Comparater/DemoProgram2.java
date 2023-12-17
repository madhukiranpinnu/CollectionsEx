package Java.Collections.Comparater;

import java.util.TreeSet;

public class DemoProgram2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>(new Comparator2());
        ts.add(1);
        ts.add(34);
        ts.add(20);
        ts.add(334);
        System.out.println(ts);
    }
}
