package Java.CollectionDemo.Map;

import java.util.IdentityHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<Integer,String> ids=new IdentityHashMap<>();
        ids.put(10,"MK");
        ids.put(10,"st");
        System.out.println(ids);
        IdentityHashMap<Integer,String> id1=new IdentityHashMap<>();
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        id1.put(i1,"MK");
        id1.put(i2,"KOL");
        System.out.println(id1);
    }
}
