import java.util.Scanner;

public class ProgramDEC25Pro2 {
    public static void main(String[] args) {
        //insert in middle of the string
        Scanner sc=new Scanner(System.in);
        String main= sc.nextLine();
        String sub=sc.next();
        int a=sc.nextInt();
        main=main.substring(0,a+1)+sub+main.substring(a+1);
        System.out.println(main);
    }
}
