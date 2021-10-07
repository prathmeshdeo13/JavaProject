package control_statements.arrays;

import java.util.HashSet;

public class CommonElementInAnArrays2 {
    public static void main(String[] args) {

        int[] arr1={4,2,5,7,8,4};
        int[] arr2 = {3,14,10,4,9,5,3};

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int no:arr1){
            hs1.add(no);
        }
        for(int no:arr2){
            hs2.add(no);
        }
        for (int no:hs2){
           boolean b = hs1.add(no);
           if(b==false){
               System.out.println(no);
           }
        }
    }
}
