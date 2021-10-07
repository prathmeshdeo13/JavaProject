package control_statements.arrays;

import java.util.HashSet;

public class CommonElementsInAnArrays {
    public static void main(String[] args) {

        int[] arr1={4,2,5,7,8,4};
        int[] arr2 = {3,14,10,4,9,5,3};

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                   hs.add(arr1[i]);
                   break;
                }
            }
        }
        for (int no:hs){
            System.out.println(no);
        }
    }
}
