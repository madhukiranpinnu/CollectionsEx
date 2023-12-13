package Java.Collections.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0;i<=10;i++){
            al.add(i);
        }
        ListIterator<Integer> li=al.listIterator();
        while (li.hasNext()){
            System.out.println(li.next()+": The next index is :"+li.nextIndex());
        }
        // To check about previous index
        while (li.hasPrevious()){
            System.out.println(li.previous()+": The previous index is :"+li.previousIndex());
        }
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<=10;i++){
            al2.add(i);
        }
        ListIterator li2=al2.listIterator();
        while (li2.hasNext()){
            Integer i=(Integer) li2.next();
            if(i%2==0){
                li2.set("Even"+i);
            }
            else {
                li2.remove();
            }
        }
        System.out.println(al2);
    }
}
