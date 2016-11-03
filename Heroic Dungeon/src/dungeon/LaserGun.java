
package dungeon;


public class LaserGun extends Weapon {

    private final String name = "Laser Gun";
    private final int damage;
    private final int overheat;

    public LaserGun(int damage, int overheat) {
        super(damage, overheat);
        this.damage = 10;
        this.overheat = 0;
    }
    
}
