package control_statements.arrays;

public class MinimumAndMaximumElementProgram {
    public static void main(String[] args) {


        int[] a={4,3,5,2,1,6};

        int max= a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("max value is "+max);


        int[] b={5,7,3,9,4,2,8};
        int min = b[0];
        for(int i=1;i<b.length;i++){
            if(b[i]<min){
                min=b[i];
            }
        }
        System.out.println("min value is "+min);
    }
}
