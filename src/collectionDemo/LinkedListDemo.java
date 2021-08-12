package collectionDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(31);
        list.add(32);
        list.add(33);
        list.add(34);
        list.add(35);

        System.out.println("LinkedList=>"+list);

        for (int i=1;i<=list.size();i++){
            System.out.println(i);
        }

        for (int j : list){
            System.out.println(j);
        }


        list.forEach((a)->{
            System.out.println(a);
        });

        list.forEach(System.out::println);
    }


}
