package Java.Collections.Set;

import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        //Intial capacity of Hashset 16
        //Load Factor is 0.75
        //After 75% filled it will increase the capacity
        HashSet<Integer> hs1=new HashSet<>(23);
        //With initial capacity
        HashSet<Integer> hs2=new HashSet<>(32,0.98f);
        //with initial capacity and load factor
        HashSet<Integer> hs3=new HashSet<>(hs);
        //With collection as the parameter
        HashSet<Object> x=new HashSet<>();
        x.add("Madhu");
        x.add(1);
        x.add(1);
        System.out.println(x.add(1));
        System.out.println(x);
    }
}
