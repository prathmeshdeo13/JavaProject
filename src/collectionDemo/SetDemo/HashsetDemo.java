package collectionDemo.SetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(8);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);

        //Set maintain insertion order.
        //Set doesn't have duplicate value.

        for (int i=1;i<=set.size();i++)
        {
            System.out.println(i);
        }

        for (int z:set) {
            System.out.println(z);
        }

        set.forEach((s)->{
            System.out.println(s);
        });

        set.forEach(System.out::println);
    }

}
