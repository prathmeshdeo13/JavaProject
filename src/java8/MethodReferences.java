package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        MethodReferences methodReferences = new MethodReferences();
    // Method Reference to instance method//


        //refer
        MyInterface myInterface = methodReferences::display;
        //calling
        System.out.println(myInterface.msg());


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,90);
        list.forEach(System.out::println);

    }
  public String display(){
        return "Hello";
  }

}

interface MyInterface{
    String msg();
}
