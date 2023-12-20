package Java.CollectionDemo.Map;

import java.util.*;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1=new HashMap<>();
        //normal Constructor
        HashMap<Integer,String> hm2=new HashMap<>(145);
        //with initial Capacity
        HashMap<Integer,String> hm3=new HashMap<>(123,0.99f);
        //with intial capacity and loadfactor
        HashMap<Integer,String> hm4=new HashMap<>(hm2);
        //with hashmap object as parameter
        //Basic
        hm1.put(1,"MK");
        hm1.put(2,"PMK");
        hm1.put(3,"SRI");
        hm1.put(4,"DSP");
        Set<Integer> set=hm1.keySet();
        System.out.println(set);
        Collection<String> list=  hm1.values();
        System.out.println(list);
        Set set12=hm1.entrySet();
        Iterator it=set12.iterator();
        while (it.hasNext()){
            Map.Entry ma=(Map.Entry)it.next();
            System.out.println(ma.getKey()+"------------"+ma.getValue());
        }
    }
}
