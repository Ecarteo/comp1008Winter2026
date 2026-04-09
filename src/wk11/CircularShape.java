package wk11;
public abstract class CircularShape extends Shape{

    //constant value
    public static final double PI = Math.PI;

    private double radius, diameter;

    public CircularShape() {}

    public CircularShape(String name, double radius){
        this(name, radius, radius * 2);
    }

    public CircularShape(String name, double radius, double diameter){
        super(name);
        setRadius(radius);
        setDiameter(radius * 2);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public abstract double circumference();
}
