package control_statements;

public class Pattern8 {
    public static void main(String[] args) {
        int temp;
        for(int i=0;i<=4;i++) {
            for (int j = 4; j >= 0; j--) {
                temp = j - (i - 1);
                System.out.print(temp);
            }
            System.out.println(0);
        }
    }
}
