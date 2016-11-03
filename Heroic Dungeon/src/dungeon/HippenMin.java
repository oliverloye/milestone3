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
public class HippenMin extends HealthItem {
    
    private final String name = "Hippen Min";
    private final int restoreHp;
    
    public HippenMin(int restoreHp) {
        super(restoreHp);
        this.restoreHp = 10;
    }
    
}   
