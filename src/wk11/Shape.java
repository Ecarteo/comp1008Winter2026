package wk11;

public abstract class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(){}

    public Shape(String name){
        setName(name);
    }

    public abstract double area();

    public abstract double perimeter();

}
