package wk9.fighting_game;

public class FightingGame {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("F1", 10, 20);
        Fighter f2 = new Fighter("F2", 20, 40);

        f1.attack(f2);

        System.out.println(f2.getHealth());


    }
}
