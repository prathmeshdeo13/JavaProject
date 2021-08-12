package staticK;

public class Employee {

    int empId;

    String name;

    static String company = "Accenture";

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;

    }

    public void show(){
    System.out.println(empId +"  "+name+"  "+company +" ");
}

    public static void main(String[] args) {
    Employee e1 = new Employee(1,"Ramesh");
    Employee e2 = new Employee(2,"Deepti");
    Employee e3 = new Employee(3,"Shreyas");
    Employee e4 = new Employee(4,"Aditi");

    e1.show();
    e2.show();
    e3.show();
    e4.show();

    }
}