package string.stringMethod;

public class isEmptyMethod {
    public static void main(String[] args) {

        String name = "";
        System.out.println(name.isEmpty());

        String address = "";
        boolean b = address.isEmpty();
        if(b==true)
        {
            System.out.println("name is empty");
        }
        else
        {
            System.out.println("name is valid");
        }
    }
}
