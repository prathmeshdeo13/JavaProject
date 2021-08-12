package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("String41",35);
        map.put("String42",36);
        map.put("String43",37);
        map.put("String44",38);
        map.put("String45",39);


        map.forEach((k,v)->{
            System.out.println(k+" "+ v);
        });
    }
}
