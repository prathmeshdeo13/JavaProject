package collectionDemo;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        for (int i=1;i<=list.size();i++){
            System.out.println(i);
        }

        for (String k :list ){
            System.out.println(k);
        };

        list.forEach((v)->{
            System.out.println(v);
        });

        list.forEach(System.out::println);
    }
}
