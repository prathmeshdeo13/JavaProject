package multithreading.threadMethod;

/*Naming Threads
1)getName()
2)setName(String name)
*/

public class Test extends Thread {
    public void run(){
        Thread.currentThread().setName("Manisha");
        System.out.println("Thread task: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Ciao :"+Thread.currentThread().getName());

        Test t1 = new Test();
        t1.start();

        Test t2 = new Test();
        t2.start();
       System.out.println(Thread.currentThread().isAlive());
       System.out.println(t1.isAlive());

    }
}
