package Java.CollectionDemo.Map.SortedMapCP;

import java.util.SortedMap;
import java.util.TreeMap;

public class Program1 {
    public static void main(String[] args) {
        SortedMap<Integer,String> sm=new TreeMap<>(new ComparaterDemo());
        sm.put(1,"MK");
        sm.put(34,"kk");
        sm.put(56,"klkl");
        System.out.println(sm);
    }
}
