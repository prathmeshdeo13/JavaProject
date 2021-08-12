package polymorphism;

public class Test1 {

    public void show() {
        System.out.println("In show method1");
    }
}
     class XYX extends Test{
      public void show() {
        System.out.println("In show method2");
    }
        public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.show();

        XYX x = new XYX();
        x.show();
        }
 }

