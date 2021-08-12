package inheritance;

public class Calculator {
    public static void main(String[] args) {
     Multiplication multiplication = new Multiplication();
     multiplication.x=(30);
     multiplication.y=(6);
     multiplication.div();
     multiplication.multi();

     multiplication.div();
        System.out.println("Division=>"+multiplication.z);

     multiplication.multi();
        System.out.println("Multiplication=>"+multiplication.z);
    }

}

class Addition {
 int x,y,z;

 public void add(){
     z=x+y;
 }
}

class Subtraction extends Addition{

    public void sub(){
        z= x-y;
    }
}

class Division extends  Subtraction{

    public void div(){
        z=x/y;
    }
}

class Multiplication extends Division{

    public void multi(){
        z=x*y;
    }
}