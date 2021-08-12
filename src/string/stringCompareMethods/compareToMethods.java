package string.stringCompareMethods;

public class compareToMethods {
    public static void main(String[] args) {
        String s1 = "a";  //97 ASCII Value or Decimal Value.
        String s2 = "A";  //65 ASCII Value or Decimal Value.
        System.out.println(s1.compareTo(s2));   // And it will convert it into UNICODE Value.

        String s3 = "abc";
        String s4 = "aBc";
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareToIgnoreCase(s4));

    }
}


// 0 => s1=s2.
// + => s1>s2.
// - => s1<s2.