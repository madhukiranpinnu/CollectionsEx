package Java.CollectionDemo.QueeDemo;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue q=new PriorityQueue();
        //Queue initialisation
        PriorityQueue pq=new PriorityQueue<>();
        //With priority Queue intialization
        SortedSet set=new TreeSet();
        PriorityQueue pq1=new PriorityQueue<>(set);
        //With collection
        PriorityQueue pwe=new PriorityQueue<>(12);
    }
}
