package MAR2024;

import java.util.Scanner;

public class MAR3Prog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows= sc.nextInt();
        int row_count=1;
        for(int i=rows;i>=1;i--) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row_count; j++) {
                System.out.print(row_count + " ");
            }
            for (int j = row_count - 1; j >= 1; j--) {
                System.out.print(row_count + " ");
            }
            row_count++;
            System.out.println();
        }

    }
}
