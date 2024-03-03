package MAR2024;

import java.util.Scanner;

public class MAR3Prog4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int row_pointer=1;
        for(int i=rows;i>=1;i--){
            for (int j=1;j<=i*2;j++){
                System.out.print(" ");
            }
            int k=1;
            for(int j=1;j<=row_pointer;j++){
                System.out.print(k+" ");
                k++;
            }
            k=k-2;
            for(int j=row_pointer-1;j>=1;j--){
                System.out.print(k+" ");
                k--;
            }
            row_pointer++;
            System.out.println();
        }
    }
}
