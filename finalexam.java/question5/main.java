// Abstract base class
abstract class Shape {
    public abstract String getDescription();
}

// Concrete subclass: Triangle
class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getDescription() {
        return "Triangle with base = " + base + ", height = " + height;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape shape = new Triangle(6.0, 4.5);
        System.out.println(shape.getDescription());
    }
}
