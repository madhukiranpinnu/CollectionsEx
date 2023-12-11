package Java.Collections.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        Iterator<Integer> i= al.iterator();
        while(i.hasNext()){
            Integer j=(Integer) i.next();
            if(j%2==0){
                System.out.println(j);
            }
            else {
                i.remove();
            }
        }
        System.out.println(al);
    }
}
