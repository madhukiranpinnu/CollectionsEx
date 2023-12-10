package Java.Collections.List;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        //To add element to the stack
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        //peak
        //it will just print the last element
        System.out.println(s.peek());
        //pop
        //it will remove the last element
        s.pop();
        System.out.println(s);
        //is empty
        //if empty it will print true
        System.out.println(s.isEmpty());
        //search
        //it will search for the element
        System.out.println(s.search(2));
    }
}
