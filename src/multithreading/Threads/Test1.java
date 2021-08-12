package multithreading.Threads;


//Performing Single task from Multiple Threads
public class Test1 extends Thread {
    @Override
    public void run() {
        System.out.println("In thread Task");
    }

    public static void main(String[] args) {
        Test1 thread1 = new Test1();
        thread1.start();

        Test1 thread2 = new Test1();
        thread2.start();

        Test1 thread3 = new Test1();
        thread3.start();

        Test1 thread4 = new Test1();
        thread4.start();
    }
}
