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
public class PulseGrenade extends Weapon
{

    private final String name = "Pulse Grenade";
    private final int damage;
    private final int overheat;

    public PulseGrenade()
    {
        this.damage = 100;
        this.overheat = 10;
    }

}
