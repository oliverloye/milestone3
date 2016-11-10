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
public class HlpenMin extends HealthItem
{

    private final String name = "Small Healthpen";
    private final int restoreHp;

    public HlpenMin()
    {
        this.restoreHp = 10;
    }

    @Override
    public String toString() {
        return name;
    }

}
