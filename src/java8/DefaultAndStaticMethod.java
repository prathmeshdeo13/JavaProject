package java8;

public class DefaultAndStaticMethod implements MyInterface3,MyInterface4{
    public static void main(String[] args) {
       DefaultAndStaticMethod defaultAndStaticMethod = new DefaultAndStaticMethod();
        System.out.println(defaultAndStaticMethod.msg());
        System.out.println(defaultAndStaticMethod.display());
        System.out.println(MyInterface3.send());

    }

   @Override
    public String msg() {
       return "Bonjour";
   }

    @Override
    public String display() {
        return "Custom implementation";
    }
}



interface MyInterface3{
    String msg(); //declaring method
    default String display(){
        return "Comment vas-tu?";
    }

    static String send(){
        return "Enchanter";
    }
}

interface MyInterface4{
    default String display(){
        return "Au revoir";
    }
}