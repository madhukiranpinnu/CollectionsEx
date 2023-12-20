package Java.CollectionDemo.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> ss=new TreeSet<>();
        ss.add(1);
        ss.add(23);
        ss.add(123);
        ss.add(2);
        System.out.println(ss);
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet(12));
        System.out.println(ss.tailSet(23));
    }
}
