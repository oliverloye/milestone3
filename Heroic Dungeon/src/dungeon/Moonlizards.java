
package dungeon;


public class Moonlizards extends Monster {

    
    public Moonlizards() {  
        super(100, ""
            +"\nA horde of small lizards scury around your feet, crawling up on your radiation suit, "
            +"\ntrying to damage it, will you attack them, or die trying to get away?");
    }

    @Override
    public int criticalHit() {
        return (super.criticalHit() + 1); //To change body of generated methods, choose Tools | Templates.
    }
}
