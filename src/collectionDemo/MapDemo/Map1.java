package collectionDemo.MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        List<Map<String,Integer>> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        map.put("Kiran",1);
        map.put("Neha",2);
        map.put("Leena",3);
        map.put("Madhuri",4);
        map.put("Shriya",5);

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Janhavi",6);
        map1.put("Rucha",7);
        map1.put("Sejal",8);
        map1.put("Aditi",9);
        map1.put("Kanchan",10);

        list.add(map);
        list.add(map1);

        list.forEach((l)->{
            l.forEach((k,v)->{
                System.out.println(k+" "+v);
            });
        });
    }
}
