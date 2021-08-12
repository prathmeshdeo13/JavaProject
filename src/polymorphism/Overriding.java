package polymorphism;

public class Overriding {

    public void show(int a) {
        System.out.println("In show method5");
    }

}
class Test extends Overriding{

        public void show(int a){
            System.out.println("In show method6");
        }

    public static void main(String[] args) {
        Test test = new Test();
        test.show(01);

        Overriding o = new Overriding();
        o.show(56);
    }
}
