package multithreading.Threads;


// Performing Single task from Single Thread
public class Test extends Thread{

    public void run(){
        System.out.println("In Thread 1");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.start();
    }
}
