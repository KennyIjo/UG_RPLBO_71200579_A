package com.ug9.mobilelegend;

import org.w3c.dom.ranges.Range;

public class Hero extends Character{
    private int healthBonus;
    private int level = 1;
    private int healthMax;
    private int lifeSteal = 50;

    public Hero(String name, int damage, int health){
        super(name, damage, health);
    }

    public void attack(Character enemy) {
        if(enemy instanceof Hero){
            attackInformation(enemy,getDamage());
        } else{
            attackInformation(enemy,getDamage());
        }
    }
//    public void setHealthBonus(int){
//
//    }
    public void addDamage(int damage){
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}
