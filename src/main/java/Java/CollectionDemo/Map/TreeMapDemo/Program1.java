package Java.CollectionDemo.Map.TreeMapDemo;

import Java.CollectionDemo.Map.SortedMapCP.ComparaterDemo;

import java.util.TreeMap;

public class Program1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>(new ComparaterDemo());
        tm.put(1,"madhu");
        tm.put(3,"KL");
        tm.put(56,"Ayodhya");
        tm.put(4,"Sams");
        System.out.println(tm);
    }
}
