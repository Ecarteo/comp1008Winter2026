package wk9.fighting_game;

public class Boss extends Fighter {

    private boolean specialMoveActivated;
    private int specialMoveCount = 1;

    public int getPower(){

        int multiplier = 1;

        if(specialMoveActivated){
            specialMoveActivated = false;
            multiplier = 3;
        }
        return multiplier * super.getPower();
    }

    public void useSpecialMove(){
        if(specialMoveCount <= 0){
            return;
        }
        specialMoveActivated = true;
        specialMoveCount--;
    }

    public Boss(String name, int power, Fighter opponent){

        super(name, power, opponent.getHealth() * 2);

        if( opponent instanceof Boss ){
            throw new IllegalArgumentException("A boss cannot fight itself");
        }

    }
}
