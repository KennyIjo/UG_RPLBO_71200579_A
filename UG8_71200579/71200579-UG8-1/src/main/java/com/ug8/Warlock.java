package com.ug8;

public class Warlock {
    private int numOfSummon;
    public Warlock implements Summoner extends Hero(){
        name='Warlock';
        health=700;
        damage=80;
    }
    public void attack(Creep){

    }
    public Golem summon(){
        summon(Golem);
        numOfSummon += 1;
    }
}
