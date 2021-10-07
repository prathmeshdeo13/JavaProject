package control_statements.arrays;

public class TraverseArrays {
    public static void main(String[] args) {

        //1D Single Dimensional Array
//        int[] a={10,20,30};
//
//        for (int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

        //2D Multi-Dimensional Array
//        int[][] a={{10,20},{30,40,50}};
//
//        for(int i=0;i< a.length;i++){
//            for (int j=0;j<a[i].length;j++){
//                System.out.println(a[i][j]);
//            }
//        }

        int[][][] a={{{10,20},{30,40}},{{50,60},{70,80,90}}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j< a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.println(a[i][j][k]);
                }
            }
        }

    }
}
