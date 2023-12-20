package Java.CollectionDemo.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedmapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String> sm=new TreeMap<>();
        sm.put(1,"MK");
        sm.put(2,"KL");
        sm.put(3,"JK");
        sm.put(67,"KLK");
        sm.put(442,"KPOk");
        System.out.println(sm);
        System.out.println(sm.tailMap(4));
        System.out.println(sm.headMap(67));
        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println(sm.subMap(1,67));
    }
}
