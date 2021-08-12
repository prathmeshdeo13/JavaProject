package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int Salary;


    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.Salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        if(this.id == employee.id){
        return 0;
        }else if(this.id>employee.id){
         return 1;
        }else {
        return -1;
    }
}
}
public class ArrayList2 {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "Radha", 25000);
        Employee employee1 = new Employee(3, "Neha", 60000);
        Employee employee2 = new Employee(4, "Vidya", 47000);
        Employee employee3 = new Employee(2, "Rama", 56000);

        List<Employee> list = new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Collections.sort(list);
        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.Salary);
        });

    }
}


