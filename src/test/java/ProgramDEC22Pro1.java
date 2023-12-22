import java.util.*;

public class ProgramDEC22Pro1 {
    public static void main(String[] args) {
        //Get a line o String and print only String without duplicated
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String replace=str.replace(" ","");
        char[] ch=replace.toCharArray();
        System.out.println(ch);
        HashSet<Character> hsc=new HashSet<>();
        for (char c:ch){
            hsc.add(c);
        }
       StringBuilder sb=new StringBuilder();
        for(char c:hsc){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
