package FEB2024;

import java.util.Scanner;

public class Feb13Prog1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int rowcount=1;
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rowcount;j++){
                System.out.print("*"+" ");
            }
            for(int j=rowcount-1;j>=1;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
            rowcount++;
        }
    }
}
