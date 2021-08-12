package collectionDemo.SetDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(25);
        set.add(25);
        set.add(23);
        set.add(22);
        set.add(21);

        System.out.println(set);
    }

    //TreeSet maintain insertion order.
    //TreeSet doesn't store duplicate values.

}
