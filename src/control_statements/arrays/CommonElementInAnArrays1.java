package control_statements.arrays;

import java.util.HashSet;

public class CommonElementInAnArrays1 {
    public static void main(String[] args) {

        int[] arr1={4,2,5,7,8,4};
        int[] arr2 = {3,14,10,4,9,5};

        HashSet<Integer> hs = new HashSet<>();
        for (int no:arr1) {
            hs.add(no);
        }

        for (int no:arr2){
           boolean b = hs.add(no);
           if(b==false){
               System.out.println(no);
           }
        }
    }
}
