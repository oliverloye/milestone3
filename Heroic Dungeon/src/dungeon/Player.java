package dungeon;

//import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {

    Scanner scan = new Scanner(System.in);
    private String name = scan.next();
    private int cache = 0;
    private int hp = 100;
    private boolean wearSuit = false;
    private final List<Item> bag;
    private Weapon weapon;

    private int playerDamage = 1;
    private final boolean crit = false;
    private int criticalHit;
    private final Random number = new Random();
    private int applyWound;

    public Player() {        
        bag = new ArrayList<>(); //opstart

    }

    public int criticalHit() {
        
        playerDamage = (number.nextInt(5) + 1) + 50;
        
        criticalHit = number.nextInt(5) + 1;
        if (criticalHit == 6) {
            return playerDamage = (playerDamage + 3); //Attack bliver fordobblet hvis tallet er lig med 6.
        } else {
            return playerDamage; //attack er som oprindeligt.
        }
    }
    
    public void checkIfDead() {
        if(hp <= 0) {
            System.out.println("GAME OVER!");
            System.exit(0);
        }
    }
    
    public void checkForCrit() {
        if(criticalHit == 6) {
            System.out.println("You made a crititcal hit!");
        }
    }
    
    public int getPlayerDamage() {
        return playerDamage;
    }

    public List<Item> getBag() {
        return bag;
    }

    public void addSingleToBag(Item newItem) {
        bag.add(newItem);
    }

    public void addAllToBag(ArrayList<Item> allItem) {
        bag.addAll(allItem);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public void addToCache(int toBeAdded) {
        this.cache += toBeAdded;
    }

    public int getCache() {
        return cache;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isWearSuit() {
        return wearSuit;
    }

    public void setWearSuit(boolean wearSuit) {
        this.wearSuit = wearSuit;
    }
    
    public void applyWound(int damage   ) {
       hp = hp - damage;
    }
    
    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }

}
