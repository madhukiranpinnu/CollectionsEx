package FEB2024;

import java.util.Scanner;

public class Feb11Prog10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<=n-i;k++){
                System.out.print(Character.toString((char) k+65)+" ");
            }
            System.out.println();
        }
    }
}
