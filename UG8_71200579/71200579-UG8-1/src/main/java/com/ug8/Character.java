package com.ug8;

public abstract class Character {
    protected String name;
    protected int health;
    protected int damage;
    public Character(String name, int health, int damage){
        this.name=name;
        this.health=health;
        this.damage=damage;
    }
    public void attack(int){

    }
    public void showCharacterInfo(){
        return name,health,damage;
    }
    public boolean isDie(){
        if (health<=0){
            return true;
        } else {
            return false;
        }
    }
}
