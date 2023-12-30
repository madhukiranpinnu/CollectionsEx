import java.util.Scanner;

public class ProgramDEC28Pro2 {
    public static void main(String[] args) {
        //Left Aligned Triangle
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
