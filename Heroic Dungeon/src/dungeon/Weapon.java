/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Oliver
 */
public class Weapon extends Item {
    
    private int damage;
    private int overheat;

    public Weapon(int damage, int overheat) {
        this.damage = damage;
        this.overheat = overheat;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getOverheat() {
        return overheat;
    }

    public void setOverheat(int overheat) {
        this.overheat = overheat;
    }
    
    
    
}
