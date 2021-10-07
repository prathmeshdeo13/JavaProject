package control_statements;

import java.util.Scanner;

public class ReverseStringProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string which you want to reverse: ");
        String name = scanner.next();
//        String name= "Janhavi";
        int leng = name.length();
        String rev = "";

        for(int i=leng-1;i>=0;i--){
          rev = rev+name.charAt(i);
      }
        System.out.println(rev);
    }


}
