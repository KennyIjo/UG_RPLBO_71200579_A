package com.ug9.mobilelegend;

public class Creep extends NPC{
    public Creep(String name, int damage, int health){
        super(name, damage, health);

    }
    public void attack(Character enemy) {
        if(enemy instanceof Minion || enemy instanceof Creep){
            System.out.println("Terjadi kesalahan! Creep tidak dapat menyerang minion maupun creep lainnya.");
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
