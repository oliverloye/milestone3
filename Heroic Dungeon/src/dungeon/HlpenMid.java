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
public class HlpenMid extends HealthItem
{

    private final String name = "Healthpen";
    private final int restoreHp;

    public HlpenMid()
    {
        this.restoreHp = 20;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
