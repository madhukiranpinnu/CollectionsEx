package Java.CollectionDemo.Map;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(1,"Madhu");
        linkedHashMap.put(2,"Kiran");
        linkedHashMap.put(3,"Pinnu");
        Set set=linkedHashMap.keySet();
        System.out.println(set);
        Collection coll=  linkedHashMap.values();
        System.out.println(coll);
        Set see=linkedHashMap.entrySet();
        Iterator it = see.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
