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
public class HippenMid extends HealthItem {
    
    private final String name = "HippenMid";
    private final int restoreHp;

    public HippenMid(int restoreHp) {
        super(restoreHp);
        this.restoreHp = 20;
    }
    
}
