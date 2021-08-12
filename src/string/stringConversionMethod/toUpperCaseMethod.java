package string.stringConversionMethod;

import java.util.Locale;

public class toUpperCaseMethod {
    public static void main(String[] args) {

        String str ="prathmesh";
        String s1 = "PRATHMESH";
        System.out.println(str.toUpperCase());
        System.out.println(s1.toLowerCase());

        int a= 10;
        String s2 = String.valueOf(a);
        System.out.println(s2);

        char[] c= str.toCharArray();
        System.out.println(c);
    }
}
