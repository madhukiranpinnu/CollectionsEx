package DEC2023;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramDEC26Pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        char[] chr=str.toCharArray();
        String LongestString="";
        int longStringValue=0;
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (int i=0;i<chr.length;i++){
            if (!map.containsKey(chr[i])){
               map.put(chr[i],i);
            }
            else {
                i=map.get(chr[i]);
                map.clear();
            }
            if(map.size()>longStringValue){
                longStringValue= map.size();
                LongestString=map.keySet().toString();
            }
        }
        System.out.println(longStringValue);
        System.out.println(LongestString);
    }
}
