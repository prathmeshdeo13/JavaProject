package string.stringConcateingMethods;

public class OperatorMethod {
    public static void main(String[] args) {

        String s1 = "Prathmesh";
        String s2 = "java";

        System.out.println(s1+s2);
        System.out.println(s1+10);
        System.out.println(s1+10+20);
        System.out.println(10+20+s1);
        System.out.println(10+s1+20);
        System.out.println(s1+20/10);      // BODMAS
    }
}
