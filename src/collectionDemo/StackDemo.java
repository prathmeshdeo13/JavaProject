package collectionDemo;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Stack<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println(vector);

        for (int i=1;i<=vector.elementAt(4);i++){
            System.out.println(i);
        }

        for (int i: vector){
            System.out.println(i);
        }

        vector.forEach((s)->{
            System.out.println(s);
        });

        vector.forEach(System.out::println);
    }
}
