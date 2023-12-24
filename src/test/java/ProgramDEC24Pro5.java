import java.util.Scanner;

public class ProgramDEC24Pro5 {
    public static void main(String[] args) {
        //Fibonacci Series
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int a=0;
        int b=0;
        int c=1;
        for (int i=0;i<count;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.printf(a+" ");
        }
    }
}
