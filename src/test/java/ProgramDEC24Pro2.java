import java.util.Scanner;

public class ProgramDEC24Pro2 {
    public static void main(String[] args) {
        //Armstrong Number
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int first=i;
        int arm=0;
        while(i>0){
            int h=i%10;
            arm=arm+(h*h*h*h);
            i=i/10;
        }
        if(arm==first){
            System.out.println("Arm Strong number"+arm);
        }
        else {
            System.out.println("Not an armstrong number"+arm);
        }
    }
}
