package Java.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Methods {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
        map1.put(1,"Madhukiran Pinnu");
        map1.put(2,"Ramachandra");
        System.out.println(map1);
        Map<Integer,String> map2=new HashMap<>();
        map2.putAll(map1);
        System.out.println(map2);
        //ContainsKey and containsValue
        System.out.println(map1.containsKey(1));
        System.out.println(map2.containsValue("Ramachandra"));
        //is empty will give true if empty
        System.out.println(map1.isEmpty());
        //size of the map
        System.out.println(map2.size());
        //remove the key related entry
        map2.remove(1);
        System.out.println(map2);
        map2.clear();
        System.out.println(map2);
        //get
        System.out.println(map1.get(1));
    }
}
