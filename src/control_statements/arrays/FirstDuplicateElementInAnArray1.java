package control_statements.arrays;

import java.util.HashSet;

public class FirstDuplicateElementInAnArray1 {
    public static void main(String[] args) {

        int[] a={6,5,4,8,5,2,4};

        HashSet<Integer> hs = new HashSet<>();
        int temp=-1;
        for(int i= a.length-1;i>=0;i--){
            if(hs.contains(a[i])){
                temp=i;
            }else {
                hs.add(a[i]);
            }
        }
        if(temp!=-1){
            System.out.println("First Duplicate Element is "+a[temp]);
        }
    }
}
