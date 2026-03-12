package wk9;

public class Week9 extends Object {


    public static void main(String[] args) {

        Human bruce = new Human("Bruce Wayne", 10, 20, 150, 40);

        Human superman =  new SuperHero("Clark Kent", 15, 25, 160, 50);

        System.out.println(superman.getSpeed());

        Human[] humans = {new Human(), new SuperHero()};

        Object[] obs = {1, true, 1.1, new Human(), "Hello", 'c'};




    }
    public static void example1(){
        Human h1 = new Human();

        Human h2 = new Human("Bruce Wayne", 10, 20, 150, 40);

        System.out.println(h1);
        System.out.println(h2);

        SuperHero batman = new SuperHero();
        System.out.println("*".repeat(10));
        System.out.println(batman);

        SuperHero superman = new SuperHero("Clark Kent", 15, 25, 160, 50);

        System.out.println(superman.getSpeed());
    }
}
