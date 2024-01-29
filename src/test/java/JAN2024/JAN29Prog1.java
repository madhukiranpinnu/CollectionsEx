package JAN2024;

import java.util.Scanner;

public class JAN29Prog1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int gcd=0;
        int lcm=0;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }
        lcm=(a*b)/gcd;
        System.out.println(lcm);
    }
}
