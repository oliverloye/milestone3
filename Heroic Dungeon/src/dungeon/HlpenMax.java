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
public class HlpenMax extends HealthItem
{

    private final String name = "Large Healthpen";
    private final int restoreHp;

    public HlpenMax()
    {
        this.restoreHp = 50;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
