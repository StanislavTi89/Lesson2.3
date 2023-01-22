import Transport.Bus;
import Transport.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("ООП_наследование");
        Car Toyota = new Car("Toyota ",
                "Corolla ", 1.6, "Black",
                2015, 250, "Japan", "Auto", "sedan",
                "ст123rus23", 4,
                new Car.Key(true, true));
        System.out.println(Toyota);

        Bus bus = new Bus("Ikarus",
                "250",
                280,
                "Red-White",
                1996,
                120,
                "Венгрия",
                "Manual",
                "Bus",
                "0005BEE",
                60);
        System.out.println(bus);
    }
}