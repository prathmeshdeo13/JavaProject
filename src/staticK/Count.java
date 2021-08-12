package staticK;

public class Count {

    static int count = 0;

    public Count() {
       count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Count count1 = new Count();
        Count count2 = new Count();
        Count count3 = new Count();
        Count count4 = new Count();
    }
}
