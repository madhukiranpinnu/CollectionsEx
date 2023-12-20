package Java.CollectionDemo.CollectionsPrograms;

import Java.CollectionDemo.Comparater.Comparater1;
import Java.CollectionDemo.Map.TreeMapDemo.ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Methods {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(34);
        al.add(5);
        Collections.reverse(al);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,new ComparatorDemo());
        System.out.println(al);
        System.out.println(Collections.binarySearch(al,12));
    }
}
