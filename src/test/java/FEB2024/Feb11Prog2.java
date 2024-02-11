package FEB2024;

import java.util.Scanner;

public class Feb11Prog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
