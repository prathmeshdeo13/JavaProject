package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        list.addAll(list1);
        System.out.println(list);
        list.set(1,25);
        System.out.println(list);


        String s = "Leena";
        System.out.println(s.hashCode());
    }
}
