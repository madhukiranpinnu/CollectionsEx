package FEB2024;

import java.util.Scanner;

public class Feb5Prog2 {
    public static void main(String[] args) {
        //Number Triangle
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println(" ");
        }
    }
}
