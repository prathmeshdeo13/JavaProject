package multithreading;

public class InterruptMethod extends Thread {
    public void run(){
        try{
            for (int i=1;i<=5;i++){
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println("Thread Interrupt: "+e);
        }
    }

    public static void main(String[] args) {
        InterruptMethod i = new InterruptMethod();
        i.start();
        i.interrupt();
    }
}
