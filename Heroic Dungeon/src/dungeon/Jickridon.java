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
public class Jickridon extends Monster {
    
    public Jickridon() {
        super(200, ""
            +"\nYou hear a loud ruumbling footsteps, echoing through the cavern ahead, "
            +"\nit's getting louder, coming closer, you jump to the left."
            +"\nAs the giant wormy creature, tunnels by, it turns around, and comes back after you."
            +"\nStand your ground, and get ready to fight!");
    }

    @Override
    public int criticalHit() {
        return (super.criticalHit() + 10); //To change body of generated methods, choose Tools | Templates.
    }
    
}
