package abstraction;

 interface InterfaceDemo {

    void show(); //Declaring method.
}

interface InterfaceDemo2{
        void display();
}

class Test implements InterfaceDemo,InterfaceDemo2{

    @Override
    public void show() {
        System.out.println("In show method1");
    }


    @Override
    public void display() {
        System.out.println("In Display method");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.show();
        test.display();
    }
}
