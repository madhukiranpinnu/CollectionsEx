package Java.CollectionDemo.QueeDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueeD {
    public static void main(String[] args) {
        Queue q=new PriorityQueue();
        q.add(12);
        q.add(23);
        q.add(45);
        q.add(12);
        System.out.println(q);
    }
}
