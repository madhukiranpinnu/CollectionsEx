package Java.CollectionDemo.Set;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Object> lhs=new LinkedHashSet<>();
        lhs.add("MKP");
        lhs.add(2);
        lhs.add(true);
        lhs.add(2);
        System.out.println(lhs);
    }
}
