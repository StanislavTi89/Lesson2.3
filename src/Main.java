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
    }
}