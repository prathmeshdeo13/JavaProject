package abstraction;

public abstract class BankDemo {
    public abstract void RBI();

    public void rule() {
        System.out.println("Age above 60 need 15G form");
    }
}

class Kotak extends BankDemo {

    public static void main(String[] args) {
        Kotak k = new Kotak();
        k.RBI();
    }

    @Override
    public void RBI() {
        System.out.println("Age should be 18");
    }
}

class HDFC extends BankDemo {

    public static void main(String[] args) {
        HDFC h = new HDFC();
        h.RBI();
        h.rule();
    }

    @Override
    public void RBI() {
        System.out.println("Age should be 18");
    }
}

class SBI extends BankDemo {

    public static void main(String[] args) {
        SBI s = new SBI();
        s.RBI();
        s.rule();
    }

    @Override
    public void RBI() {
        System.out.println("Age should be 18");
    }
}