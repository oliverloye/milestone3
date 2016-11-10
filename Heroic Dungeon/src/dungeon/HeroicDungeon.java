package dungeon;

import java.io.File;

public class HeroicDungeon
{

    public static void main(String[] args)
    {

        Dungeon dungeon = new Dungeon();
        
        File file = null;
        dungeon.saveGameDataToFile(file);
        
        dungeon.welcome();
        dungeon.createDungeon();
        dungeon.createPlayer();
        dungeon.gameLoop();

        // Dette er en GitHub TEST !!!! :D
        // Dette er en ny Github TEST!! ;)
    }
}
