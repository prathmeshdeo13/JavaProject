package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {

        List<Map<String,Integer>> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();

        map.put("String51",61);
        map.put("String52",62);
        map.put("String53",63);
        map.put("String54",64);
        map.put("String55",65);

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("String56",66);
        map1.put("String57",67);
        map1.put("String58",68);
        map1.put("String59",69);
        map1.put("String60",70);

        list.add(map);
        list.add(map1);

        list.forEach((s)-> {
            s.forEach((k, v) -> {
                System.out.println(k+" "+v);
            });
        });
    }
}
