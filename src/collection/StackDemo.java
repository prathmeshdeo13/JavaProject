package collection;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {

        //Stack store duplicate values.

        Stack<Integer> stack = new Stack<>();
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);
        stack.push(23);
        stack.push(25);

        stack.forEach(s->{
            System.out.println(s);
        });



        //Vector stores duplicate values.
        //Vector doesn't maintain insertion order.


        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(4);
        vector.add(2);
        vector.add(3);

        vector.forEach(v->{
            System.out.println(v);
        });


    }
}
