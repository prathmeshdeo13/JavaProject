package multithreading;

public class ThreadPriority extends Thread {
    public void run(){
        System.out.println("Child Thread");
        System.out.println("SetNewPriority: "+Thread.currentThread().getPriority());

    }


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());

        ThreadPriority t1 = new ThreadPriority();
        t1.setPriority(7);
        t1.start();
    }
}
