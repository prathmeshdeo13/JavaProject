package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        //LinkedList stores the duplicate values.
        //LinkedList doesn't maintain insertion order.

        List<Integer> list = new LinkedList<>();
        list.add(21);
        list.add(23);
        list.add(21);
        list.add(22);
        list.add(25);

        list.forEach(l->{
            System.out.println(l);
        });
    }
}
