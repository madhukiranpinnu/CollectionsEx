package DEC2023;

import java.util.Scanner;

public class ProgramDEC28Pro1 {
    public static void main(String[] args) {
        //Numbers Swapping without temp
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
