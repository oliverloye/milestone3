
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
    
    private int playerDamage;
    private final boolean crit = false;
    private int criticalHit;
    private final Random number = new Random();
   

    public Player(int hp/*, int playerDamage*/) {
        this.hp = hp;
        /*this.playerDamage = playerDamage;*/
        bag = new ArrayList<>(); //opstart
       
    }
    
    public void attack() {
        playerDamage = number.nextInt(5)+1;
    }
    
    public void criticalHit() {
        criticalHit = number.nextInt(6)+1;
        if(criticalHit == 6) {
            playerDamage = (playerDamage * 2); //Attack bliver fordobblet hvis tallet er lig med 6.
            return;
        } else return; //attack er som oprindeligt.
    }

    public int getPlayerDamage() {
        return playerDamage;
    }
    
    
    
    public void addSingleToBag( Item newItem ){
        bag.add(newItem);
    }

    public void addAllToBag( ArrayList<Item> allItem ){
        bag.addAll(  allItem  );
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
    
    public void addToCache( int toBeAdded )
       {
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
    
    
     @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }
    
    
    
    

   
    
    
}