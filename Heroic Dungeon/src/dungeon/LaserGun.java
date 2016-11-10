package dungeon;

public class LaserGun extends Weapon
{

    private final String name = "Laser Gun";
    private final int damage;
    private final int overheat;

    public LaserGun()
    {
        this.damage = 10;
        this.overheat = 0;
    }

    @Override
    public String toString() {
        return name;
    }
    
    

}
