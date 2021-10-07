package control_statements.arrays;

public class FindMissingElementFromAnArray {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,7,9,10};

        int exp_ele = a.length+1;
        int total_sum = exp_ele * (exp_ele+1)/2;

        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println("Missing Element From An Array is: "+ (total_sum-sum));
    }
}
