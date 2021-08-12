package multithreading.Threads;


//Performing Multiple task from Multiple Threads
class PlayingVideo extends Thread {
    public void run() {
        System.out.println("Playing Video");
    }
}

class PlayingMusic extends Thread {
    public void run() {
        System.out.println("Playing Music");
    }
}

class ProgressBar extends Thread {
    public void run() {
        System.out.println("ProgressBar is executing");
    }
}

class Timer extends Thread {
    public void run() {
        System.out.println("Timer is executing");
    }
}

public class VlcApp {
    public static void main(String[] args) {
        PlayingVideo thread1 = new PlayingVideo();
        thread1.start();

        PlayingMusic thread2 = new PlayingMusic();
        thread2.start();

        ProgressBar thread3 = new ProgressBar();
        thread3.start();

        Timer thread4 = new Timer();
        thread4.start();

    }
}
