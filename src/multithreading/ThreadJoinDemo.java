package multithreading;

// Main Thread waits for Child Thread to Execute.
public class ThreadJoinDemo extends Thread{

    public void run(){
        try{
            for(int i=1;i<=5;i++){
                Thread.sleep(1000);
                System.out.println("Child Thread: "+i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception{
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        t1.start();
        t1.join();

        try{
            for(int i=1;i<=5;i++){
                Thread.sleep(1000);
                System.out.println("Main Thread: "+i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
