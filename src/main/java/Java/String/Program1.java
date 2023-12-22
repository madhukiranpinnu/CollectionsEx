package Java.String;

public class Program1 {
    public static void main(String[] args) {
        //String Constructors
        String s=new String("Madhukiran");
        System.out.println(s);
        //Char Array
        char[] ch={'a','b','c','d'};
        String s1=new String(ch);
        System.out.println(s1);
        //Char Array with initial index
        String s2=new String(ch,1,2);
        System.out.println(s2);
    }
}
