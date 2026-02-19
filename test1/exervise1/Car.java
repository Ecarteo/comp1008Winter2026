package test1.exervise1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Car {
    // Variables
    int year;
    String plateNumber;
    int[] serviceYears;

    static String regex = "^[A-Z]{2,3}-\\d{4}$";
    static int minYear = 1990;
    static int maxYear = 2026;

    // Main method
    public static void main(String[] args) {
        Car c1 = new Car(2020, "AB-1234", new int[]{2021, 2023});
        Car c2 = new Car(1995, "XYZ-8888");
        Car c3 = Car.newModel("BC-4567");
        Car c4 = Car.oldModel("BUP-0001");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }

    // Constructors
    // Constructor 1: all fields
    public Car(int year, String plateNumber, int[] serviceYears) {
        setYear(year);
        setPlateNumber(plateNumber);
        this.serviceYears = serviceYears;
    }

    // Constructor 2: no serviceYears
    public Car(int year, String plateNumber) {
        setYear(year);
        setPlateNumber(plateNumber);
        this.serviceYears = new int[]{};
    }

    // Factory methods
    public static Car newModel(String plateNumber) {
        return new Car(minYear, plateNumber);
    }

    public static Car oldModel(String plateNumber) {
        return new Car(minYear, plateNumber);
    }

        public void setYear(int year) {
        if (year < minYear || year > maxYear) {
            throw new IllegalArgumentException(
                "Year must be between " + minYear + " and " + maxYear + ". Got: " + year
            );
        }
        this.year = year;
    }

    // Setters
    public void setPlateNumber(String plateNumber) {
        if (plateNumber == null || !Pattern.matches(regex, plateNumber)) {
            throw new IllegalArgumentException(
                "Invalid plate number: " + plateNumber +
                ". Expected format: AB-1234 or ABC-1234"
            );
        }
        this.plateNumber = plateNumber;
    }

    public void setServiceYears(int[] serviceYears) {
        this.serviceYears = serviceYears;
    }

    // Getters
    public int getYear()              { return year; }
    public String getPlateNumber()    { return plateNumber; }
    public int[] getServiceYears()    { return serviceYears; }
    public static String getRegex()   { return regex; }

    // Overriding
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car {")
          .append(" year=").append(year)
          .append(", plateNumber='").append(plateNumber).append("'")
          .append(", serviceYears=").append(Arrays.toString(serviceYears))
          .append(" }");
        return sb.toString();
    }
}