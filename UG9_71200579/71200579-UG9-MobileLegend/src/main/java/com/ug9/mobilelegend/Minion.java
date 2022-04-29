package com.ug9.mobilelegend;

public class Minion extends NPC{
    public Minion(String name, int damage, int health){
        super(name, damage, health);
    }

    public void attack(Character enemy) {
        if(enemy instanceof Creep){
            System.out.println("Terjadi kesalahan! Minion tidak dapat menyerang Creep.");
        } else{
            super.attack(enemy);
            attackInformation(enemy,getDamage());
            enemy.setHealth(enemy.getHealth()-this.getDamage());
            if(enemy.getHealth()<=0){
                enemy.isDie();
            }
        }
    }
}
