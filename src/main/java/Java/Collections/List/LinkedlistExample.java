package Java.Collections.List;

import java.util.LinkedList;

public class LinkedlistExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        //Adding Elements to First
        ll.addFirst(2);
        ll.addFirst(3);
        System.out.println(ll);
        //adding elements at Last
        ll.addLast(34);
        ll.addLast(5);
        System.out.println(ll);
        //To get the First Element
        System.out.println(ll.getFirst());
        //To get Last Element
        System.out.println(ll.getLast());
        //To remove First Element
        ll.removeFirst();
        System.out.println(ll);
        //To remove the last element
        ll.removeLast();
        System.out.println(ll);
        //Normal Initilization
        LinkedList<Integer> l=new LinkedList<>();
        //Collection as the parameter
        LinkedList<Integer> l1=new LinkedList<>(l);
    }
}
