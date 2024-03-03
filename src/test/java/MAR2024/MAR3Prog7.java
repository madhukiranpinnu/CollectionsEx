package MAR2024;

import java.util.Scanner;

public class MAR3Prog7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int rowPoint=rows;
        for(int i=0;i<=rows;i++){
            for (int j=1;j<=i*2;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=rowPoint;j++){
                System.out.print("*"+" ");
            }
            for (int j=rowPoint-1;j>=1;j--){
                System.out.print("*"+" ");
            }
            rowPoint--;
            System.out.println();
        }
    }
}
