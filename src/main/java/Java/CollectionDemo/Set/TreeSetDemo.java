package Java.CollectionDemo.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet set=new TreeSet<>();
        // Normal Constructor
        TreeSet set1=new TreeSet<>(set);
        //Treeset object as constructor
        SortedSet st=new TreeSet();
        TreeSet<Integer> ts=new TreeSet<>(st);
        //Sorted set object as parameter
        set.add(1);
        set.add(2);
        System.out.println(set);
        set.add(1);
        System.out.println(set);
        //duplicates entry
//        set.add("MK");
//        System.out.println(set);
        //entry of heterogenous
        set.add(null);
        //adding null insertion
        System.out.println(set);
    }
}
