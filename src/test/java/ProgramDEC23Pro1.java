import java.util.Scanner;

public class ProgramDEC23Pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int inputVal =num;
        int rev = 0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(inputVal==rev){
            System.out.println("It is a polindrome");
        }
        else {
            System.out.println("Not a polindrome");
        }
    }
}
