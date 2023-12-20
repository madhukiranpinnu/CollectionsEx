package Java.CollectionDemo.Map.TreeMapDemo;

import Java.CollectionDemo.Map.SortedMapCP.ComparaterDemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        //Normal Constructor
        TreeMap<Integer,String> tm1=new TreeMap<>(tm);
        //with other Treemap objet
        SortedMap<Integer,String> sm=new TreeMap<>();
        TreeMap<Integer,String> t1=new TreeMap<>(sm);
        //with Sortedmap object
        TreeMap<Integer,String> t3=new TreeMap<>(new ComparaterDemo());
        //with comparator
    }
}
