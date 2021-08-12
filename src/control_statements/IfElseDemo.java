package control_statements;

public class IfElseDemo {
    public static void main(String[] args) {
    int i,j,k,l;
    i=2025;
    j=2020;
    k=2000;
    l=1000;

    //Multiple Conditions//

    if (i>j && i>k && i>l){
        System.out.println("I is the biggest number");
    }else if (j>k && j>l){
        System.out.println("J is the biggest number");
    }else if(k>l){
        System.out.println("K is the biggest number");
    }else {
        System.out.println("L is the biggest number");
    }

    //Single condition//
    int a=-20;
    if(i>0){
        System.out.println("Number is positive");
    }else{
        System.out.println("Number is negative");
    }


    int age =20;
    String nationality ="American";
    if(age>18){
        if(nationality=="Indian"){
            System.out.println("You can vote");
        }else {
            System.out.println("Not Indian");
        }
        }else {
        System.out.println("You cannot vote");
    }
    }
}
