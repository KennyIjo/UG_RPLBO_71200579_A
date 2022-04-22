package com.ug8;

public class LoneDruid {
    private int killCreep;
    private int level;
    public LoneDruid implements Upgradeable implements Summoner extends Hero(){
        name='Lone Druid';
        health=1800;
        damage=140;
    }
    public SpiritBear summon(){
        summon(SpiritBear);
    }
    public void upgrade(){
        if (killCreep>=3){
            level += 1;
            killCreep -= 3;

        }
    }
    public void showCharacterInfo(){

    }
    public void attack(Creep){
        if (Creep isDie()){
            killCreep += 1;
        }
    }
}
