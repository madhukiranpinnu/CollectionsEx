package Java.CollectionDemo.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        //ArrayList Initialisation
        List<String> al1=new ArrayList<>();
        //It can also be done in
        ArrayList<String> ap2=new ArrayList<>(23);
        //We can intialise the intial capacity of the array
        //Initail capacity of the arraylist is 10
        ArrayList<String> a=new ArrayList<>();
        a.add("mk");
        a.add("sai");
        System.out.println(a);
        //ArrayList Methods
        ArrayList<String> b=new ArrayList<>();
        a.add("Sri");
        //Add all will add the entire a to b
        b.addAll(a);
        System.out.println(b);
        //get will give the value of that index
        System.out.println(b.get(2));
        //set will set or change the value of that index
        b.set(0,"madhu");
        System.out.println(b);
        //removes the element at the specific index
        b.remove(2);
        System.out.println(b);
        b.add("madhu");
        b.add("kuamr");
        b.add("Pinnu");
        b.add("Sai");
        System.out.println(b);
        //index of will give index of the element from left to right
        System.out.println(b.indexOf("madhu"));
        //last index of gives the index from right to left
        System.out.println(b.lastIndexOf("madhu"));
        //Collection Interface methods
        //It will print true if the collection is empty
        System.out.println(b.isEmpty());
        System.out.println(al.isEmpty());
        //add All will add the elements to the presnt collection
        al.addAll(b);
        System.out.println(al);
        //retainall will retain all the elements matches compared collection
        ArrayList<Integer> z=new ArrayList<>();
        z.add(1);
        z.add(2);
        z.add(3);
        z.add(4);
        z.add(5);
        z.add(6);
        z.add(7);
        System.out.println(z);
        ArrayList<Integer>y=new ArrayList<>();
        y.add(2);
        y.add(3);
        y.add(4);
        y.add(10);
        System.out.println(y);
        y.retainAll(z);
        System.out.println(y);
        y.add(10);
        //removeall will remove all the matched elements
        y.removeAll(z);
        System.out.println(y);
        //Iteerator will iterator one by one element
        Iterator<Integer> i=z.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        ArrayList<Integer> x=new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        //Contains will print true if the element is present otherwise it will print false
        System.out.println(x.contains(4));
        System.out.println(x.contains(5));
        ArrayList<Integer> w=new ArrayList<>();
        w.add(1);
        w.add(2);
        //Contains all is similar to contains but here other than element we use collection
        System.out.println(x.containsAll(w));
        w.add(3);
        w.add(4);
        //If both collections all elements matches then only it will give true
        System.out.println(x.equals(w));
        //Clear will remove all elements
        w.clear();
        System.out.println(w);
        //hashcode will return the hashcode of the collection
        System.out.println(x.hashCode());
        //size
        //it will print no of elements in that collection
        System.out.println(w.size());
        System.out.println(x.size());
        //Splititerator
        Spliterator<Integer> sp=x.spliterator();
        System.out.println(sp.tryAdvance(u-> System.out.println(u)));
        //To Array
        Object[] o=x.toArray();
        System.out.println(o.toString());
        //Ensure ccapacity will ensure upto that capacity
        ArrayList<Integer> alp=new ArrayList<>(23);
        al.ensureCapacity(45);
    }
}
