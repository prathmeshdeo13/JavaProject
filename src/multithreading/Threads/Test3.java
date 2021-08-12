package multithreading.Threads;


// Performing Multiple task from Multiple Threads.
class MyThread extends Thread {
    public void run() {
        System.out.println("In Thread 1");
    }
}

class MyThread1 extends Thread {
    public void run() {
        System.out.println("In Thread 2");
    }
}

class MyThread2 extends Thread {
    public void run() {
        System.out.println("In Thread 3");
    }
}

public class Test3 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        MyThread1 thread1 = new MyThread1();
        thread1.start();

        MyThread2 thread2 = new MyThread2();
        thread2.start();

    }
}

