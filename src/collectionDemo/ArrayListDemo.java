package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //traditional loop
        for(int i=1;i<=list.size();i++){
            System.out.println(i);
        }

        //Enhanced loop
        for(int i: list){
            System.out.println(i);
        }

        //Lambda Expression
        list.forEach((s)->{
            System.out.println(s);
        });

        //Method References
        list.forEach(System.out::println);
    }
}