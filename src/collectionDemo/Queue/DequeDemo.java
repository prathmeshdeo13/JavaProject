package collectionDemo.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque =  new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);

        System.out.println(deque);

        for (int i:deque){
            System.out.println(i);
        }

        deque.forEach((d)->{
            System.out.println(d);
        });

    }
}
