package multithreading;

public class YieldDemo extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        YieldDemo t1 = new YieldDemo();
        t1.start();

        for (int i=1;i<=5;i++){
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
