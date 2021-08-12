package abstraction;

public abstract class FilmDemo {
    public abstract void film();// Declaring method
    public void age() { //Defining method
        System.out.println("Age should be 18");
    }
}


    class Tanaji extends FilmDemo{

        @Override
        public void film() {
            System.out.println("Film is U/A");
        }

        public static void main(String[] args) {
            Tanaji tanaji = new Tanaji();
            tanaji.film();
        }
    }

    class AmericanPie extends FilmDemo{

        @Override
        public void film() {
            System.out.println("Film is A");
        }

        public static void main(String[] args) {
            AmericanPie americanPie = new AmericanPie();
            americanPie.film();
            americanPie.age();
        }
    }


