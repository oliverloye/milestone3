/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;


public class Drakodrone extends Monster {
    
    public Drakodrone() {
        super(300, ""
            +"\nThe metallic claws digging into the ground, the loud roar of the titanium beast, " 
            +"\nmakes you feel a sensation of awe, but this is what stands between you, and the end of this horrible astroid nightmare.");
    }

    @Override
    public int criticalHit() {
        return (super.criticalHit() + 20); //To change body of generated methods, choose Tools | Templates.
    }
    
}
