package FEB2024;

import java.util.Scanner;

public class Feb7Prog6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print(Character.toString((char) i+65));
            }
            System.out.println();
        }
    }
}
