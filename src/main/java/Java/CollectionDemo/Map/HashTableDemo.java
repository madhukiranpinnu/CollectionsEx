package Java.CollectionDemo.Map;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        //Normal Constructor
        Hashtable<Integer,String> ht1=new Hashtable<>(34);
        //with initial Capacity
        Hashtable<Integer,String> ht2=new Hashtable<>(45,0.8f);
        //with initial capacity and loadfactor
        Hashtable<Integer,String> ht4=new Hashtable<>(ht1);
        //with other object as parameter
        ht.put(1,"sdsf");
        ht.put(5,"kjn");
        System.out.println(ht);
    }
}
