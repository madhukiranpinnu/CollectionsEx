package FEB2024;

import java.util.Scanner;

public class Feb7Prog1 {
    public static void main(String[] args) {
        //Alphabet triangle
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(Character.toString((char) i+65)+" ");
            }
            System.out.println();
        }
    }
}
