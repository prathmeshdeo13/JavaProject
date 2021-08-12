package inheritance;

public class InheritanceA {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}

class A{

    public void showA(){
        System.out.println("In method A");
    }
}

// Single Level Inheritance.
class B extends A{

    public void showB(){
        System.out.println("In method B");
    }
}

// Multilevel Inheritance.
class C extends B{

    public void showC(){
        System.out.println("In method C");
    }

// hierarical Inheritance
// class A object can call itself.
// class B object can call both class B and class A.
//class C object can call both class C and class A.
// Neither class B object can call class C object nor class C object can call class B object in hierarical.

}

