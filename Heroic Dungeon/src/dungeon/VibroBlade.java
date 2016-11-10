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
public class VibroBlade extends Weapon
{

    private final String name = "Vibro Blade";
    private final int damage;
    private final int overheat;

    public VibroBlade()
    {
        this.damage = 25;
        this.overheat = 0;
    }

}
