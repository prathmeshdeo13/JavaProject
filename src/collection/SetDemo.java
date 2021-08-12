package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        //Set doesn't store duplicate values.
        //Set doesn't maintain insertion order.

        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(13);
        set.add(15);

        set.forEach(s->{
            System.out.println(s);
        });

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(91);
        linkedHashSet.add(94);
        linkedHashSet.add(91);
        linkedHashSet.add(93);
        linkedHashSet.add(95);

        linkedHashSet.forEach(l->{
            System.out.println(l);
        });
    }
}
