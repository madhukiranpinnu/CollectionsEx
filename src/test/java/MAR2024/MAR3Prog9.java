package MAR2024;

import java.util.Scanner;

public class MAR3Prog9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows= sc.nextInt();
        int row_pointer=rows;
        for(int i=0;i<=rows;i++){
            for(int j=1;j<=i*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row_pointer;j++){
                System.out.print(row_pointer+" ");
            }
            for (int j=row_pointer-1;j>=1;j--){
                System.out.print(row_pointer+" ");
            }
            row_pointer--;
            System.out.println();
        }
    }
}
