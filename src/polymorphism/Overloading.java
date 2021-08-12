package polymorphism;

public class Overloading {
    // Sequence of arguments
    public void show(String a,int b,float c) {
        System.out.println("In Show Method1");
    }

    public void show(int a,String b,double c) {
        System.out.println("In show Method2");
    }


    public static void main(String[] args) {
    Overloading o =new Overloading();
    o.show("Aditya",55,10.5f);
    o.show(23,"Manish",55.60);
    o.show('k');
    o.show(18);
    }

    // Type of argument
    public void show(char a){
        System.out.println("In show method3");
    }

    public void show(int a){
        System.out.println("In show method4");
    }
}