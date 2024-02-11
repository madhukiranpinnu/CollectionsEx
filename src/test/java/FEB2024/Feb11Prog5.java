package FEB2024;

import java.util.Scanner;
public class Feb11Prog5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("  ");
            }
            for (int k=0;k<=i;k++){
                System.out.print(Character.toString((char) i+65)+" ");
            }
            System.out.println();
        }
    }
}
