package staticK;

public class StaticMethods {

    static void display() {
        System.out.println("In static methods");
    }

    public static void main(String[] args) {
//        StaticMethods s = new StaticMethods();
//        s.display();
        StaticMethods.display();
    }
}
