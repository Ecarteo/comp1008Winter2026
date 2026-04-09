package wk9.fighting_game;

public class Player extends Fighter {

    private int blockAttackCount = 1;
    private boolean isBlockingAttack;


    public void setHealth(int health) {
        if(isBlockingAttack){
            isBlockingAttack = false;
            return;
        }
        super.setHealth(health);
    }
    public void useBlockAttack(){
        if(blockAttackCount <= 0){
            return;
        }
        blockAttackCount--;
        isBlockingAttack = true;

    }


    public Player(String name, int power, int health){
        super(name, power, health);
    }


}
