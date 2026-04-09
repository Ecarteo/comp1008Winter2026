package wk11;

public abstract class ThreeDShape extends Shape {

    private double depth;

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public abstract double volume();
}
