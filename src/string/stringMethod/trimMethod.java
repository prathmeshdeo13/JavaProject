package string.stringMethod;

public class trimMethod {
    public static void main(String[] args) {
        String name ="   abc";
        System.out.println(name);
        System.out.println(name.trim());

        String address = "     ";
        if(address.trim().length()==0)
        {
            System.out.println("name is empty");
        }
        else
        {
            System.out.println("name is valid");
        }
    }
}
