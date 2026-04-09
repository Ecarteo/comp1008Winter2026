package wk10.inheritance_tasks.medium.task1;

public class Dalmatian extends Dog{

    @Override
    public String sound(){
        return "101 Dalmatians";
    }

    public void mysteryMethod(){
        //System.out.println(sound());

        System.out.println(super.sound());

        //question 1: is this legal? YES

        //question 2: what is outputted?
    }
}
