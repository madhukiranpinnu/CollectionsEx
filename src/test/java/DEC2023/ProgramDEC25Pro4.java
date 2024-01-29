package DEC2023;

import java.util.Scanner;

public class ProgramDEC25Pro4 {
    public static void main(String[] args) {
    // Insert a charecter in the string
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        char a='s';
        int i=sc.nextInt();
        StringBuilder sb=new StringBuilder(str);
        sb.insert(i,a);
        System.out.println(sb);
    }
}
