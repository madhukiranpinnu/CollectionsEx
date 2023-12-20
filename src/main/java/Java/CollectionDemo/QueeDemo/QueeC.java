package Java.CollectionDemo.QueeDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueeC {
    public static void main(String[] args) {
        Queue q=new PriorityQueue();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}
