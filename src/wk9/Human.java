package wk9;

public class Human {

    private String name;
    private double power;
    private int speed;

    public double height;
    protected int age;

    public Human(){}

    public Human(String name, double power, int speed, double height, int age) {
        this.name = name;
        this.power = power;
        this.speed = speed;
        this.height = height;
        this.age = age;
    }

    public Human(String name, double power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", speed=" + speed +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
