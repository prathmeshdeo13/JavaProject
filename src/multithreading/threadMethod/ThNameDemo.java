package multithreading.threadMethod;

public class ThNameDemo {


    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println(Thread.currentThread().getName()); //getName() for main thread.
        Thread.currentThread().setName("Shekhar");
        System.out.println(Thread.currentThread().getName()); //getName() for setting name for thread.
        System.out.println(10/0);
    }
}
