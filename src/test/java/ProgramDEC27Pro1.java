import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ProgramDEC27Pro1 {
    public static void main(String[] args) {
        //Longest polindrome substring
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        char[] cht=str.toCharArray();
        Map<Integer,String> map=new LinkedHashMap<>();
        for(int i=0;i<cht.length;i++){
           char ci= cht[i];
           for(int j=i+1;j<cht.length;j++){
               char cj=cht[j];
               if(ci==cj){
                   if(polindrome(str.substring(i,j+1))){
                       map.put(str.substring(i,j+1).length(),str.substring(i,j+1));
                   }
               }
           }
        }
        Set<Integer> st=map.keySet();
        int max=0;
        for(Integer i:st){
            if(i<max){
                max=i;
            }
        }
        System.out.println(max);
    }
    static boolean polindrome(String st){
        boolean polindrome=false;
        StringBuilder sb=new StringBuilder(st);
        sb.reverse();
        if(sb.equals(st)){
            polindrome=true;
        }
        return polindrome;
    }
}
