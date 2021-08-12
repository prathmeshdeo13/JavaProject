package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDeclaration {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(32);
        list.add(33);
        list.add(35);
        list.add(34);

        list.forEach(s -> {
            System.out.println(s);
        });

        List<Integer> list1 = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println(list1);

        List<Integer> list2 = List.of(21,22,23,14,15,25,26,27,28,29,30);
        System.out.println(list2);

        List<Integer> list3 =new ArrayList<>() {{
           add(51);
           add(52);
           add(53);
        }};
        System.out.println(list3);

    }
}
