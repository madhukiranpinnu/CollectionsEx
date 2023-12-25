import java.util.Scanner;

public class ProgramDEC25Pro1 {
    public static void main(String[] args) {
        //Program to print even length of the String line word
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String[] splitter=str.split(" ");
        for (String spr:splitter){
            if(spr.length()%2==0){
                System.out.println(spr);
            }
        }
    }
}
