package DEC2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramDEC25Pro3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();
        List lis1=strList(str1);
        List lis2=strList(str2);
        if(lis1.removeAll(lis2)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not an anagram");
        }
    }
     static List strList(String string){
        List<Character> list=new ArrayList<>();
        for(int i=0;i<string.length();i++){
            list.add(string.charAt(i));
        }
        return list;
    }
}
