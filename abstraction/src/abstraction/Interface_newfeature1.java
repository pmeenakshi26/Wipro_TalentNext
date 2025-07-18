package abstraction;

interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

public class Interface_newfeature1 implements Vehicle, FourWheeler {
    @Override
    public void message() {
        Vehicle.super.message();
        FourWheeler.super.message();
    }

    public static void main(String[] args) {
        Interface_newfeature1 obj = new Interface_newfeature1();
        obj.message();
    }
}
