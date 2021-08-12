package collectionDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("AB");
        set.add("CD");
        set.add("EF");
        set.add("GH");
        set.add("IJ");

        System.out.println(set);

        set.forEach((f)->{
            System.out.println(f);
        });

        set.forEach(System.out::println);
    }
}
