package DEC2023;

import java.util.Scanner;

public class ProgramDEC24Pro6 {
    public static void main(String[] args) {
        //Prime
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                count=count+1;
            }
        }
        if(count==1){
            System.out.println("Not prime");
        }
        else{
            System.out.printf("Prime");
        }
    }
}
