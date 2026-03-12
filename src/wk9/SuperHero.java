package wk9;

public class SuperHero extends Human{

    private String superPower, heroName;
    public double scarinessLevel;


    public SuperHero(){}

    public SuperHero(String name, double power, int speed,
                     double height, int age, String superPower,
                     String heroName, double scarinessLevel) {
        super(name, power, speed, height, age);
        this.superPower = superPower;
        this.heroName = heroName;
        this.scarinessLevel = scarinessLevel;
    }

    public SuperHero(String name, double power, int speed, double height, int age){
//        setName(name);
//        setPower(power);
//        setSpeed(speed);
//        this.height = height;
//        this.age = age;
            super(name, power, speed, height, age);
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public int getSpeed() {
        return 2 * super.getSpeed();
    }

    public String toString(){

        return super.toString()
                .replace("Human", "Superhero")
                .replace("}", "")
                + ", HeroName=" + heroName + ", SuperPower=" + superPower +
                ", scarinessLevel = " + scarinessLevel + "}";
    }
}
