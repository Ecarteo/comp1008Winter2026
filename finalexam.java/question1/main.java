// Base class
class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving on the road");
    }
}

// Subclass Boat
class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("Boat is sailing on the water");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Polymorphic array of Vehicle references
        Vehicle[] vehicles = {
            new Vehicle(),
            new Car(),
            new Boat()
        };

        // Loop and invoke overridden move() on each object
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}