package MAR2024;

import java.util.Scanner;

public class MAR3Prog10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows= sc.nextInt();
        int total=rows*2+1;
        int row_pointer=1;
        for(int i=total;i>=1;i--){
            for(int j=1;j<=(total/2+1)*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row_pointer;j++){
                System.out.print("*"+" ");
            }
            for(int j=row_pointer-1;j>=1;j--){
                System.out.print("*"+" ");
            }
            row_pointer++;
            System.out.println();
        }
    }
}
