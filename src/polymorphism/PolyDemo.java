package polymorphism;

public class PolyDemo {
  public void show(int a,String b){ //Sequence of Arguments.
      System.out.println("In show method1");
  }

  public void show(String a,int b){
      System.out.println("In show method2");
  }

    public static void main(String[] args) {
      PolyDemo polyDemo = new PolyDemo();
      polyDemo.show(10,"Shekhar");
      polyDemo.show("Manisha",55);
    }

    public void show(int a) { // Type of Arguments.
        System.out.println("In show method3");
    }

    public void show(String a){
            System.out.println("In show method4");
        }
    }

