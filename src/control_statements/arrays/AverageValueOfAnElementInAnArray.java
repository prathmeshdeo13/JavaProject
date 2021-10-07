package control_statements.arrays;

public class AverageValueOfAnElementInAnArray {
    public static void main(String[] args) {

        int[] a={4,5,8,7,2,3};

        int total = 0;
        int avg;

        for(int i=0;i<a.length;i++){
            total = total+a[i];
            avg = total/a.length;
            System.out.println("\n Total is: "+total+   "\n Average is "+avg);
        }
    }
}
