package control_statements;

public class SwapTwoNumbersProgram {
    public static void main(String[] args) {

        //Swaping two numbers using 3rd variable.
        int a=10,b=20;
        int t;
        t=a;
        a=b;
        b=t;

        System.out.println("A: "+a);
        System.out.println("B: "+b);


        //Swaping Two numbers without using 3rd variable.
        int c=10,d=20;
        c=c+d;
        d=c-d;
        c=c-d;

        System.out.println("C: "+c);
        System.out.println("D: "+d);
    }
}
