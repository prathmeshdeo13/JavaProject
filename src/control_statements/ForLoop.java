package control_statements;

public class ForLoop {
    public static void main(String[] args) {
//        for (int i=0;i<=5;i++){
//            System.out.println(i);
//        }
//
//    for(int i=0;i<20;i++){
//        System.out.println(i);
//    }

//
//    for(int i=0;i<=5;i++){
//        for(int j=5;j>i;j--){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }


//Design Pattern//
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
// Traditional forloop
    for(int i=10;i>0;i--){
        System.out.println(i);
    }


    //Array loop//
    int[] arr ={1,2,3,4,5,6,7,8,9};

    for(int i=0;i< arr.length;i++){
        System.out.println(arr[i]);
    }

    for(int i= arr.length- 1;i>=0;i--){
        System.out.println(arr[i]);
    }
    }
}

