package multithreading;

public class InterruptedAndIsInterruptedMethod extends Thread{

    public void run(){
        System.out.println("A1: "+Thread.interrupted());
        System.out.println("A2: "+Thread.currentThread().isInterrupted());
        try{
            for (int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println("A3: "+Thread.interrupted());
            }
        }catch (Exception e){
            System.out.println("Interrupted Thread: "+e);
        }
    }

    public static void main(String[] args) {
        InterruptedAndIsInterruptedMethod i = new InterruptedAndIsInterruptedMethod();
        i.start();
        i.interrupt();
    }
}
