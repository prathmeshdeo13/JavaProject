package string;

public class    StringDemo {

    public static void main(String[] args) {

        char[] arr ={'p','r','a','t','h','m','e','s','h'};
        String s = new String(arr);
        System.out.println(s);



        String s1 = new String("Prathmesh");
        String s2= new String("Sejal");
        String s3 ="Harshada";
       // s2.concat("loves");
        s2=s2.concat("loves");   //String literal
        System.out.println(s2.concat(s1));


        String s4 ="kiara";
        String s5 ="Kiara";
        String s6= new String("Urvashi");
        String s7 = new String("Urvashi");
        System.out.println(s4==s5);
        System.out.println(s6.equals(s7));
    }
}
