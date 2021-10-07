package control_statements.arrays;

import java.util.ArrayList;

public class EvenAndOddAlgorithm {
    public static void main(String[] args) {

        int[] a = {8, 5, 10, 12, 3, 1, 4};

        ArrayList<Integer> al1 = new ArrayList();
        ArrayList<Integer> al2 = new ArrayList();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                al1.add(a[i]);
            } else {
                al2.add(a[i]);
            }
        }

        int temp = 0;
        System.out.println("Even Numbers are");
        for (int no : al1) {
            temp = temp + no;
            System.out.println(no);
          }
            System.out.println("No of Even Numbers are "+al1.size());
            System.out.println("Sum of Even Numbers are "+temp);
            System.out.println("-----------------------------------------------------------");

        int temp1= 0;
        System.out.println("Odd Numbers are");
        for (int no : al2) {
            temp1=temp1+no;
            System.out.println(no);
        }
            System.out.println("No of Odd Numbers are"+al2.size());
            System.out.println("Sum of Odd Numbers are "+temp1);
            System.out.println("-------------------------------------------------------------");

    }
}
