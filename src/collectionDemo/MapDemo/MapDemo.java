package collectionDemo.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Neeraj");
        map.put(2,"Hritik");
        map.put(3,"Akshay");
        map.put(4,"Janhavi");
        map.put(5,"Kashmira");

        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
