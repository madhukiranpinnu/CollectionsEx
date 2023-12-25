import java.util.Scanner;

public class ProgramDEC25Pro5 {
    public static void main(String[] args) {
        //Swapping charecters from one to two
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length-1;i+=2){
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
        }
        System.out.println(ch);
    }
}
