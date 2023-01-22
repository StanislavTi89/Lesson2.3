package Transport;

import com.sun.jdi.connect.Transport;

public class Car extends Transport {
    private final String brand;
    private final String model;
    private double engineCapacity;
    private String color;
    private int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private int numberSeats;
    private boolean isSummerWinter;
    private Key key;

    public Car(String brand, String model, double engineCapacity, String color,
               int year, String country, String transmission, String bodyType,
               String regNumber, int numberSeats, Key key) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.numberSeats = numberSeats;
        this.key = key;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public boolean isSummerWinter() {
        return isSummerWinter;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void changeType(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            isSummerWinter = false;
        }
        if (month >= 4 && month <= 10) {
            isSummerWinter = true;
        }
    }

    public int validateCount(int vCount) {
        return vCount <= 0 ? 4 : vCount;
    }

    public static String validateCountry(String value, String rus) {
        return validateCountry(value, "Rus");
    }

    public static double validateEngineCapacity(double value) {
        return value <= 0 ? 1.5 : value;
    }

    public static int validateYear(Integer value) {
        return value == null || value <= 1900 ? 2000 : value;
    }

    public static String validateColor(String value, String синий) {
        return validateColor(value, "Синий");
    }

    public static String validateTransmission(String value, String Коробка) {
        return validateTransmission(value, "Автомат");
    }


    public static class Key {
        private final Boolean remoteStart;
        private final Boolean keyAccess;

        public Key(boolean remoteStart, boolean keyAccess) {
            this.remoteStart = remoteStart;
            this.keyAccess = keyAccess;
        }

        public boolean remoteStart() {
            return remoteStart;
        }

        public boolean keyAccess() {
            return keyAccess;
        }

        public String toString() {
            return (remoteStart ? "модуль удаленки, " : "без удаленки, ") + (keyAccess ? "запуск без ключа, " : "запуск с ключем, ");
        }
    }

    public String toString() {
        return getBrand() + " " + getModel() + ", " + getEngineCapacity() + ", " + getColor()
                + ", " + getYear() + ", " + getCountry() + " " + getTransmission() + ", " +
                getBodyType() + ", " + getNumberSeats() + ", " + getRegNumber() + ", ";

    }

}