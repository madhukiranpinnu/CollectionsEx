package Java.Collections.List;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        //Normal initialization
        Vector<Integer> v=new Vector<>();
        v.add(1);
        System.out.println(v);
        //Initialization with collection
        Vector<Integer> v1=new Vector<>(v);
        System.out.println(v1);
        //Initialization with the initial capacity
        Vector<Integer> v2=new Vector<>(10);
        for(int i=0;i<10;i++){
            v2.add(i);
        }
        System.out.println(v2);
        System.out.println(v2.capacity());
        //Initialization with initial capacity and incremental capacity
        Vector<Integer> v3=new Vector<>(10,23);
        for(int i=0;i<=10;i++){
            v3.add(i);
        }
        System.out.println(v3);
        System.out.println(v3.capacity());
        //Methods
        //addElement
        //It will add the element to Vector
        Vector u=new Vector<>();
        //collection add method
        u.add(1);
        //vector add method
        u.addElement(3);
        System.out.println(u);
        //Remove Element
        //normal collection remove
        u.remove(0);
        //vector remove method
        u.removeElement(3);
        System.out.println(u);
        Vector<Integer> x=new Vector<>();
        for(int i=0;i<=10;i++){
            x.add(i);
        }
        System.out.println(x);
        //remove element at the specific index
        x.removeElementAt(0);
        System.out.println(x);
        x.removeAllElements();
        System.out.println(x);
        for(int i=0;i<=10;i++){
            x.add(i);
        }
        //To get First and last Element
        System.out.println(x.firstElement());
        System.out.println(x.lastElement());
        //Size and Capacity
        System.out.println(x.size());
        System.out.println(x.capacity());
    }
}
