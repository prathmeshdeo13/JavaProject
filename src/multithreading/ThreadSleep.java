package multithreading;

public class ThreadSleep extends Thread {
    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        t1.start();
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
