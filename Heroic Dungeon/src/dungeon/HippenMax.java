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
public class HippenMax extends HealthItem {
    
    private final String name = "Hippen Max";
    private final int restoreHp;

    public HippenMax(int restoreHp) {
        super(restoreHp);
        this.restoreHp = 50;
    }
    
    
}
