package string.stringUpdateMethod;

public class replaceMethod {
    public static void main(String[] args) {
        String s1 = "that is demo";
        String s2 = "this is demo";
        System.out.println(s1.replace("is", "was"));
        System.out.println(s1.replaceFirst("is", "was"));
        System.out.println(s2.replaceAll("is","was"));
        System.out.println(s2.replaceAll("is(.)","was"));
        System.out.println(s2.replaceAll("is(.*)","was"));
    }
}
