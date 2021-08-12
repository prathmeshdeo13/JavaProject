package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        List<Integer> list1 = new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.addAll(list1);
        System.out.println(list);
        list.set(4,12);
        System.out.println(list);


        String s="Thursday";
        String s1="Friday";

     s.hashCode();
        System.out.println(s.hashCode());

      s1.hashCode();
        System.out.println(s1.hashCode());
    }
}
