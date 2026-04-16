// Abstract base class
abstract class Shape {
    String name;

    protected Shape(String name) {
        this.name = name;
    }

    public abstract double area();
}

// Concrete subclass: Circle
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass: Rectangle
class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(2.0),
            new Rectangle(3.0, 4.0)
        };

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.name);
            System.out.println("Area:  " + shape.area());
            System.out.println();
        }
    }
}