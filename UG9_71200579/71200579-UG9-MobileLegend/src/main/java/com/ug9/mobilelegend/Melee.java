package com.ug9.mobilelegend;

public class Melee extends Hero implements Skill{
    public Melee(String name, int damage, int health){
        super(name, damage, health);
    }
    public void ultimate() {
        System.out.println(this.getName() + " mengaktifkan ulti. Damage saat ini bertambah 100");
        setDamage(getDamage()+100);
    }
    public void attack(Character enemy) {
        super.attack(enemy);
        enemy.setHealth(enemy.getHealth()-this.getDamage());
        if(enemy.getHealth()<=0){
            enemy.isDie();
            this.setLevel(+1);
        }
    }
}
