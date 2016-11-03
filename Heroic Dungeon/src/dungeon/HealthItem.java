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
public class HealthItem extends Item {
    
    private int restoreHp;

    public HealthItem(int restoreHp) {
        this.restoreHp = restoreHp;
    }

    public int getRestoreHp() {
        return restoreHp;
    }

    public void setRestoreHp(int restoreHp) {
        this.restoreHp = restoreHp;
    }
    
    
    
}
