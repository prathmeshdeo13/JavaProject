package string.stringMethod;

public class lengthMethod {
    public static void main(String[] args) {

        String name ="Prathmesh";
        String Email="abc@gmail.com";
        String password="xyz123";

        System.out.println(name.length());

        String name1=null;
        int i = name1.length();
        if(i==0)
        {
            System.out.println("name is empty");
        }else{
            System.out.println("name valid");
        }
    }
}
