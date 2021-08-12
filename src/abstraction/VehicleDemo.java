package abstraction;

public abstract class VehicleDemo {
    public abstract void Vehicle();  //Declaring method
    public void licence(){           //Defining method
        System.out.println("Age should be 18");
    }

    public VehicleDemo() {
        System.out.println("In abstract Constructor");
    }
}

class Car extends VehicleDemo{

    @Override
    public void Vehicle() {
        System.out.println("MVC Licence");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.Vehicle();
        car.licence();
    }
}


class Mopped extends VehicleDemo{

    @Override
    public void Vehicle() {
        System.out.println("LWMC");
    }

    public static void main(String[] args) {
        Mopped mopped = new Mopped();
        mopped.Vehicle();
        mopped.licence();
    }
}

class Cycle extends VehicleDemo{

    @Override
    public void Vehicle() {
        System.out.println("N/A");
    }

    public static void main(String[] args) {
        Cycle cycle =  new Cycle();
        cycle.Vehicle();
    }
}

