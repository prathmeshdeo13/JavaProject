package string.stringCompareMethods;

public class equalsMethod {
    public static void main(String[] args) {

        String s1 = "kanika";
        String s2 = "Kanika";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2)); //In Upper and Lower Case.
        System.out.println(s1.equals(""));

        String s3 = "";
        if(s3.equals(""))
        {
            System.out.println("name is empty");
        }
        else
        {
            System.out.println("name is valid");
        }
    }
}
