package Java.CollectionDemo.Comparables;

public class CompareToDemo {
    public static void main(String[] args) {
        System.out.println("A".compareTo("B"));
        //When A is small than B it will -1
        System.out.println("B".compareTo("A"));
        //When A is big than B it will give +1
        System.out.println("A".compareTo("A"));
        //When both are equal
    }
}
