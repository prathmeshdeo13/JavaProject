package multithreading;

public class DaemonDemo extends Thread {

    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Child thread");
    }


    public static void main(String[] args) {

        System.out.println("Main thread");

        DaemonDemo daemonDemo = new DaemonDemo();
        daemonDemo.setDaemon(true);
        daemonDemo.start();
    }
}
