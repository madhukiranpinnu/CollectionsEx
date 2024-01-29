package DEC2023;

import java.util.*;

public class ProgramDEC24Pro4 {
    public static void main(String[] args) {
        //Print duplicate charecters in String
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> count=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(count.containsKey(s.charAt(i))){
                count.put(s.charAt(i),(count.get(s.charAt(i)))+1);
            }
            else {
                count.put(s.charAt(i),1);
            }
        }
        Set<Character>  set=new HashSet<>();
        set=count.keySet();
        for(Character d:set){
            if(count.get(d)>1){
                System.out.println(d+"----"+count.get(d));
            }
        }
    }
}
