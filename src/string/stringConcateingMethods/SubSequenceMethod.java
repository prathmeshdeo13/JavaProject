package string.stringConcateingMethods;

public class SubSequenceMethod {
    public static void main(String[] args) {
        String s = "this is demo";
        System.out.println(s.subSequence(3,9));  //subsequence Method(int beginIndex,int endIndex).
        System.out.println(s.substring(0,11));  //substring Method.(int beginIndex),(int beginIndex,int endIndex).

    }
}
