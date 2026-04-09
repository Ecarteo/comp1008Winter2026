package wk11;

public class Rectangle extends Shape{

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(){}
    public Rectangle(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
    @Override
    public double area(){
        return length * width;
    }
}
