package multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("In Runnable method");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
