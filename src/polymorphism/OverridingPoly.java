package polymorphism;

public class OverridingPoly  {

    public void show() {
        System.out.println("In show method1");
    }
}
class ABC extends OverridingPoly {

    public void show()  {
        System.out.println("In show method2");
    }

    public static void main(String[] args) {
        ABC a = new ABC();
        a.show();


        OverridingPoly o = new OverridingPoly();
        o.show();
    }
}
