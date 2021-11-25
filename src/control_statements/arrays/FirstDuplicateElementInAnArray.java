package control_statements.arrays;

public class FirstDuplicateElementInAnArray {
    public static void main(String[] args) {
        int[] a={6,5,4,8,5,2,4};

        for(int i=0;i< a.length-1;i++){
            int temp=0;
            for(int j=i+1;j< a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("first Duplicate element in an array is "+a[i]);
                    temp = temp+1;
                    break;
                }
            }
            if(temp>0){
                break;
            }
        }
    }
}
