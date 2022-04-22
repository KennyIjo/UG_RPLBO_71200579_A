package com.ug8;

public class Golem {
    private int kill;
    public Golem implements Summoner extends SummonCharacter(Summoner){
        name='Golem';
        health=1000;
        damage=120;
    }
    public void attack(Creep){
        if (Creep isDie()){
            kill += 1;
        }
    }
    public Golem summon(){
        if(kill>0){
            summon(Golem);
            kill -= 1;
        } else{
            return null;
        }
    }
}
