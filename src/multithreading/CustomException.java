package multithreading;

public class CustomException {
    public static void main(String[] args) {
        int age = 20;
        try {
            if (age <= 18) {
                throw new UnderAgeException("You cannot vote as you are under age");
            } else {
                System.out.println("You can vote");
            }
        } catch (UnderAgeException e) {
            e.printStackTrace();
        }
    }
}

class UnderAgeException extends Exception{
    public UnderAgeException(String message) {
        super(message);
    }
}