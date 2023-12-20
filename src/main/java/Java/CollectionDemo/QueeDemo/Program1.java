package Java.CollectionDemo.QueeDemo;

import Java.CollectionDemo.Map.SortedMapCP.ComparaterDemo;

import java.util.PriorityQueue;

public class Program1
{
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue<>(new ComparaterDemo());
        pq.add(1);
        pq.add(2);
        System.out.println(pq);
    }
}
