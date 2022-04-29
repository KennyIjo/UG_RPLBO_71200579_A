package com.ug9.mobilelegend;

public class Ranged extends Hero implements Skill{
    public Ranged(String name, int damage, int health){
        super(name, damage, health);
    }

    public void ultimate() {
        System.out.println(this.getName() + " mengaktifkan ulti. Damage saat ini bertambah 150");
        setDamage(getDamage()+150);
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
