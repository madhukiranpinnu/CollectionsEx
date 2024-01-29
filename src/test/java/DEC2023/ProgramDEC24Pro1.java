package DEC2023;

import java.util.Scanner;

public class ProgramDEC24Pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sv=new StringBuilder(s);
        sv=sv.reverse();
        String cor=new String(sv);
        System.out.println(cor);

    }
}
