package Java.CollectionDemo.ArraysDemo;

import Java.CollectionDemo.Map.TreeMapDemo.ComparatorDemo;

import java.util.Arrays;
import java.util.List;

public class MethodsDemo {
    public static void main(String[] args) {
        Integer[] stra=new Integer[3];
        stra[0]=1;
        stra[1]=90;
        stra[2]=86;
        Arrays.sort(stra);
       for(Integer i:stra){
           System.out.println(i);
       }
       Arrays.sort(stra,new ComparatorDemo());
        for(Integer i:stra){
            System.out.println(i);
        }
        Arrays.sort(stra);
        System.out.println(Arrays.binarySearch(stra,86));
        System.out.println(Arrays.binarySearch(stra,60));
        Integer[] arI={1,34,56,21,89};
        List li=Arrays.asList(arI);
        System.out.println(li);
    }
}
