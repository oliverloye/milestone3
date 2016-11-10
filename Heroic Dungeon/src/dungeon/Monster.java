
package dungeon;

import java.util.Random;


public class Monster {
    
    private String name;
    private int monsterHp;
    private String monsterDescription;
   
    private int monsterDamage;
    private final boolean crit = false;
    private int criticalHit;
    private final Random number = new Random();
    private int applyWound;

    public Monster(int hp, String description) {
        monsterHp = hp;
        monsterDescription = description;
    }
   
    public int criticalHit() {
   
       monsterDamage = number.nextInt(5) + 1;
        
       criticalHit = number.nextInt(5) + 1;
       if (criticalHit == 6) {
           return monsterDamage = (monsterDamage + 3); //Attack bliver fordobblet hvis tallet er lig med 6.
       } else {
           return monsterDamage; //attack er som oprindeligt.
       }
    }
    
    public void checkForCrit() {
        if(criticalHit == 6) {
            System.out.println("You made a crititcal hit!");
        }
    }
   
   public void applyWound(int damage   ) {
       monsterHp = monsterHp - damage;
   }


    public int getMonsterHp() {
        return monsterHp;
    }

    public int getMonsterDamage() {
        return monsterDamage;
    }

    public String getMonsterDescription() {
        return monsterDescription;
    }

    public void setMonsterDescription(String monsterDescription) {
        this.monsterDescription = monsterDescription;
    }
    
    
   
   
    
}


