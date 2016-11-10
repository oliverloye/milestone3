package dungeon;

import java.util.Random;

public class Combat {
    
    public void fightOneRound(Player p1, Monster monster) {
        
        int playerAttack = p1.criticalHit();
        int monsterAttack = monster.criticalHit();
        
        
        //Monster angriber player
        p1.applyWound(monsterAttack);
        monster.checkForCrit();
        System.out.println("\nThe monster did " + monsterAttack + " damage to your FACE!");
        System.out.println("Player hp: " + p1.getHp() + "\n");
        
        
        //Player angriber monster
        monster.applyWound(playerAttack);
        p1.checkForCrit();
        System.out.println("You did " + playerAttack + " damage to the monster!");
        System.out.println("monster hp: " + monster.getMonsterHp() + "\n");
            
            
        
        
            
            
            
            //If monster is alive, it must attack Player:
            
    }
    

}
