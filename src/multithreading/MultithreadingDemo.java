package multithreading;

public class MultithreadingDemo extends Thread{

    @Override
    public void run(){
        System.out.println("In run method");
    }

    public static void main(String[] args) {
        MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
        multithreadingDemo.start();
    }



}
