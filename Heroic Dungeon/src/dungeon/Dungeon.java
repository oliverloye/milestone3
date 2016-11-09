package dungeon;

import java.util.ArrayList;
import java.util.Scanner;

public class Dungeon
{
    private Player player1;
    private Room current;
    private Combat combat;

    public Dungeon() {
        
        combat = new Combat();
    }
    
    

    public void welcome()
    {
        System.out.println("\nMoriMoriTek.Inc is a hyper company of the year 22XX of the international space calendar, "
                + "\nmaking their money off of the greatest war in the history of the Andromeda galaxy, selling weapons. "
                + "\nSince then, they've branched out, started mining for Eridium on rogue asteroids throughout their galaxy. "
                + "\nEridium is a dangerous substance, highly toxic to most sentient life, since it's radiation blocks brain "
                + "\nimpulses and if not wearing the right protective gear one will be rendered braindead in a matter of minutes."
                + "\nlanded your small smugglers ship on this abandoned asteroid. “224B6” was the name you saw on the giant MoriMoriTek  "
                + "\nthe docking bay. Eridium is as dangerous as it is valuable which why you've landed here—to make yourself the "
                + "\nsign outside richest single person in the known universe. The reason why the asteroid was abandoned will soon become "
                + "\nvery clear to our young smuggler.");
    }

    public void gameLoop()
    {
        //TEST----------------------------------------------
//        sleepCount();
//        System.out.println("\n----------LOADING-----------");
//        System.out.print(".");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.println(".");
//        System.out.println("----------UPLOADING-----------");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.print(".");
//        sleepCount();
//        System.out.println(".");
//        sleepCount();
//        System.out.println("----------STARTING-----------");
//        sleepCount();
//        System.out.println("3");
//        sleepCount();
//        System.out.println("2");
//        sleepCount();
//        System.out.println("1");
//        sleepCount();
//        System.out.println("0");
//        System.out.println("\nHere we go!");
//        sleepCount();

        //TEST----------------------------------------------
        boolean play = true;
        String answer = "";
        System.out.println(current.getDescription());

        Scanner scan = new Scanner(System.in);

        while ( play )
        {

            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("help"))
            {
                getHelp();
            } else if (answer.equalsIgnoreCase("check cache")) {
                System.out.println("\nTotal of Eridium: " + player1.getCache());
            } else if (answer.equalsIgnoreCase("loot")) {
                
                if(current.getNumberOfEridium() == 0 || current.getNumberOfEridium() < 0 && current.getRoomTreasure().isEmpty()) {
                    System.out.println("There is nothing to loot!");
                } else if(!(current.getRoomTreasure().isEmpty())) {
                        ArrayList<Item> allItems = current.getRoomTreasure();
                        player1.addAllToBag(allItems); //Lægger alle items fra arraylisten over i spilleres bag
                        System.out.println("You've just looted " + current.getRoomTreasure().toString());
                        current.clearRoomTreasure();
                }
                if(current.getNumberOfEridium() > 0) {
                    
                    System.out.println("You've just looted " + current.getNumberOfEridium() + " chunk(s) of Eridium!");

                    player1.addToCache(current.getNumberOfEridium());
                    current.setNumberOfEridium(0);
                }
                
                if (current.getRoomNumber() == 20) {
                    System.out.println("\nCongratulations! You reached the final room");
                    System.out.println("\nYou've collected a total of " + player1.getCache() + " Eridium");
                    System.exit(0);
                }
            } else if (answer.equalsIgnoreCase("hint")) {
                System.out.println(current.getHint());
            } else if (answer.equalsIgnoreCase("wear")) {
                if (current.getRoomNumber() == 1) {
                    player1.setWearSuit(true);
                    System.out.println("The suit is now equiped!");
                } else {
                    System.out.println("There is nothing to wear");
                }
            } else if (answer.equalsIgnoreCase("north")) {
                goNorth();
                checkChangingRoom();
                checkMonster();
                System.out.println(current.getDescription());
            } else if (answer.equalsIgnoreCase("east")) {
                goEast();
                checkChangingRoom();
                checkMonster();
                System.out.println(current.getDescription());
            } else if (answer.equalsIgnoreCase("south")) {
                goSouth();
                checkChangingRoom();
                checkMonster();
                System.out.println(current.getDescription());
            } else if (answer.equalsIgnoreCase("west")) {
                goWest();
                checkChangingRoom();
                checkMonster();
                System.out.println(current.getDescription());
            } else if (answer.equalsIgnoreCase("quit")) {
                play = false;
                System.exit(0);
            } else if (answer.equalsIgnoreCase("bag")) {
                System.out.println("Inventory: \n" + player1.getBag());
            }
            else {
                System.out.println("That is not a valid command!\nPlease try again.");
            }
        }
    }

    public void createDungeon() {       
        //Oprette alle monster :
        Monster m1 = new Monster(15,"this is a description");
        Monster m2 = new Monster(20, "this is a description");
        
        
        
        
//Opretter objekter:
        //TEST ROOM BELOW
        Room testRoom = new Room(1, 21, "This is a test room!", "TEST", -234);
        //TEST ROOM ABOVE
        Room loadingBay = new Room(1, 0, ""
                + "\nYou feel the artificial gravity, keeping your feet on the ground. Remember, "
                + "\nyou can always inquire your Automated industrially Recognized Minicomputer, AiRM for short, "
                + "\nfor Hint in a sticky situation. "
                + "\nIf you get freaked out, or bored, you can always Quit while you're ahead and flee the mines,"
                + "\nbut in the hurry you will drop your Cache of Eridium. In this hangar there is absolutely nothing "
                + "\nto Loot so you decide to press on. There is only one door in the vast hollowed out loading bay, and "
                + "\nit is found to the North. You must now decide what to do next!", "Hint: Try moving into the next room.", 0);
        loadingBay.add(new HlpenMin());
        Room changingRoom = new Room(4, 1, "\nThe light flickers are on, you are standing in a changing room surrounded by what "
                + "\nyou can best describe as hazmat suits, they are big and white and look very heavy, but manageable to carry "
                + "\nand to wear. This helmet is way bigger than your head and it has a large square window in the front for "
                + "\nlooking purposes equipped with a lamp to light up the dark caverns on the side. From where you stand, you "
                + "\ncan now see four doors including the door back and three doors each with a sign over it. To the West is a "
                + "\ndoor labelled “Excavated”, the Northernmost door is labelled “Main Shaft” while the last door to the East is "
                + "\nlabelled “Dormitory”. What will you do?", "Mabye it's a good idea to \"wear\" that suit..?",10);
        changingRoom.add(new LaserGun());
        changingRoom.setMonster(m2);
        Room dumbLoud1 = new Room(2, 2, "\nYou've entered a long hallway, with rocky sides, and stallecmites shooting up from the ground everywhere. "
                + "\nWhat will you do?", "Hint: Try moving on", 0);
        Room dumbLoud2 = new Room(2, 3, "\nYou continue into the dark of the mines, taking a hard right, still, this barren cave-system, gives you the creeps"
                + "\nWhat will you do?", "Hint: Try moving on", 2);
        Room dumbLoud3 = new Room(2, 4, "\nYou move through the caves only being able to see the cone of light that forms where you look. A sudden shadow moves"
                + "\nin your line of vision and you get startled, standing completely still, but darting your head around to catch another glimpse of the creature. "
                + "\nNothing shows up, you stand there, paranoid, thinking that it might show up again, but, nevertheless, you can't hear, see or feel anything in this"
                + "\ncave section. What will you do?", "Hint: Try moving on", 5);
        Room dumbLoud4 = new Room(2, 5, "\nA litte further down the tunnel, is a faint light, but what is casting it?", "Hint: What could that light be?", 0);
        Room dumbLoud5 = new Room(1, 6, "\nA dead end, but a dead end, filled with small Eridium chunks!", "Hint: Well, pick them up!", 8);
        dumbLoud5.add(new VibroBlade());
        Room ingenuitySmart1 = new Room(3, 7, "You enter the white walled halls of the dormitory, what might await you within...", "Hint: Try moving on.", 0);
        Room ingenuitySmart2 = new Room(2, 8, "\nYou enter a brightly lit room, the white walls are holey with large rocks protruding through. In the middle"
                + "\nof the room there is an undamaged data terminal and the keyboard is written with one of MoriMoriTek's many corporate trademarked fonts—"
                + "\nalmost unreadable. There is but one button in a sea of white which appears red. What will you do?",
                "Hint: Feature not implemented yet, sorry.", 3);
        Room ingenuitySmart3 = new Room(2, 9, "An empty room, with a couple of tables thrown about, nothing really noteworthy.", "Hint: Try moving on", 0);
        ingenuitySmart3.add(new HlpenMid());
        Room ingenuitySmart4 = new Room(3, 10, "\nSomething catches your eyes! It was a mirror, you look at yourself, and review your face behinde the mask, "
                + "\n'damn I look tired” you mumble in the mask.'", "Try moving on", 3);
        Room ingenuitySmart5 = new Room(2, 11, "A light flickers, but doesn't completely turn on. There is a sign just beneath the lamp reading Sector G. "
                + "Does this remind you of something? What will you do?", "Hint: Feature not implemened yet, sorry.", 0);
        Room ingenuitySmart6 = new Room(1, 12, "\nThis room is a smugglers dream with lots of hidden away goods. It sparkles in your eyes, "
                + "\nrefined Eridium and RealChocolatetm Candy bars that even you thought was gone after being out of production for years now. "
                + "\nUnderneath a pile of RealChocolatetm Candy bars, you find a small information card the size of ???, which you plug into your AiRM, "
                + "\nand the AiRM reads it aloud to you: “Excerpt from the memoirs of Ian Stomache: We've been overrun, I've got no idea what hit us, but "
                + "\nwe collided with something, something not of this universe. We tried to fight it, their weapons left no trace of our bodies like they "
                + "\njust absorbed us. I better face this like a man and fight this on my own terms. I will leave this behind for anyone to find. I sure"
                + "\nhope you fare better on this Fujinforsaken rock!”" + "What will you do?", "Hint: You aren't suppose to be here...", 25);
        ingenuitySmart6.add(new PulseGrenade());
        ingenuitySmart6.add(new PulseGrenade());
        ingenuitySmart6.add(new PulseGrenade());
        Room straightBland1 = new Room(2, 13, "You walk into the tunnel, it's steep, uphill clmibing.", "Hint: Try moving on", 1);
        Room straightBland2 = new Room(3, 14, "You see a man, walking around the corner, you chase want to chase after him?", "Hint: Chase the man, whom went left!", 0);
        Room straightBland3 = new Room(2, 15, "You ignore the man and move straight, ", "Hint: You sure that man wasn't enticing? He wasn't wearing a suit...", 2);
        Room straightBland4 = new Room(2, 16, "You get around the corner, but nothing is there...", "Hint: Look for the man", 0);
        Room straightBland5 = new Room(3, 17, "You spot the man again, he is standing straight, staring at you", "Hint: Is he even human? Am I going crazy?", 1);
        Room straightBland6 = new Room(2, 18, "You move towards him, he.. flickers? you now realize he was a Hologram, all along.", "Hint: Such a dissapointment", 3);
        Room straightBland7 = new Room(2, 19, "You move further up a hillclimb inside the cavern, noticing a glow, at the end of the tunnel", "Hint: Is this what i think it is?", 0);
        Room straightBland8 = new Room(1, 20, "\nAfter having climbed these tunnels and having encountered countless mirages, you find yourself lost "
                + "\nand confused at the top of a chute. All around the chute lies countless small bundles of refined and unrefined Eridium ready "
                + "\nfor being chucked down the hole. What will you do?", "Hint: Try picking it up!", 7);

        //Sætter alle referencer
        
        //Test below
        testRoom.north = loadingBay;
        loadingBay.south = testRoom;
        //Test above
        
        loadingBay.north = changingRoom;

        changingRoom.south = loadingBay;
        changingRoom.north = straightBland1;
        changingRoom.east = ingenuitySmart1;
        changingRoom.west = dumbLoud1;

        dumbLoud1.east = changingRoom;
        dumbLoud1.north = dumbLoud2;

        dumbLoud2.south = dumbLoud1;
        dumbLoud2.west = dumbLoud3;

        dumbLoud3.east = dumbLoud2;
        dumbLoud3.west = dumbLoud4;

        dumbLoud4.east = dumbLoud3;
        dumbLoud4.south = dumbLoud5;

        dumbLoud5.north = dumbLoud4;

        ingenuitySmart1.west = changingRoom;
        ingenuitySmart1.north = ingenuitySmart3;
        ingenuitySmart1.east = ingenuitySmart2;

        ingenuitySmart2.west = ingenuitySmart1;
        ingenuitySmart2.north = ingenuitySmart4;

        ingenuitySmart3.south = ingenuitySmart1;
        ingenuitySmart3.east = ingenuitySmart4;

        ingenuitySmart4.east = ingenuitySmart3;
        ingenuitySmart4.south = ingenuitySmart2;
        ingenuitySmart4.north = ingenuitySmart5;

        ingenuitySmart5.south = ingenuitySmart4;
        ingenuitySmart5.east = ingenuitySmart6;

        ingenuitySmart6.west = ingenuitySmart5;

        straightBland1.south = changingRoom;
        straightBland1.north = straightBland2;

        straightBland2.south = straightBland1;
        straightBland2.west = straightBland4;
        straightBland2.north = straightBland3;

        straightBland3.south = straightBland2;
        straightBland3.west = straightBland5;

        straightBland4.east = straightBland2;
        straightBland4.north = straightBland5;

        straightBland5.east = straightBland3;
        straightBland5.south = straightBland4;
        straightBland5.west = straightBland6;

        straightBland6.east = straightBland5;
        straightBland6.north = straightBland7;

        straightBland7.south = straightBland6;
        straightBland7.north = straightBland8;

        straightBland8.south = straightBland7;

        //Afslutter med at sætte current til at pege på "starting room":
        current = loadingBay;
    }

    public void sleepCount()
    {
        try
        {
            Thread.sleep(500);
        } catch (InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public void getHelp()
    {
        System.out.println("Commands:");
        sleepCount();
        System.out.println("\"North\"");
        sleepCount();
        System.out.println("\"East\"");
        sleepCount();
        System.out.println("\"South\"");
        sleepCount();
        System.out.println("\"West\"");
        sleepCount();
        System.out.println("\"Quit\"");
        sleepCount();
        System.out.println("\"Hint\"");
        sleepCount();
        System.out.println("\"Check cache\"");
        sleepCount();
        //System.out.println("\"Move\"");
        //System.out.println("\"Use\"");
        System.out.println("\"Loot\"");
        //System.out.println("\"Equip\"");
        System.out.println("\"Wear\"");
        System.out.println("\"Attack\"");
    }

    public void goNorth() {
        if (!(current.north == null)) {
            current = current.north;
            
        } else {
            System.out.println("There is no door in that direction!");
        }
    }

    public void goSouth() {
        if (!(current.south == null)) {
            current = current.south;
            System.out.println(current.getDescription());
        } else {
            System.out.println("There is no door in that direction!");
        }
    }

    public void goEast() {
        if (!(current.east == null)) {
            current = current.east;
            System.out.println(current.getDescription());
        } else {
            System.out.println("There is no door in that direction!");
        }
    }

    public void goWest() {
        if (!(current.west == null)) {
            current = current.west;
            System.out.println(current.getDescription());
        } else {
            System.out.println("There is no door in that direction!");
        }
    }

    //Opretter spilleren
    public void createPlayer()
    {
        
        System.out.println("\nWhat is your name?");

        player1 = new Player();
        player1.addSingleToBag(new LaserGun());
        player1.addSingleToBag(new HlpenMin());
        player1.addSingleToBag(new HlpenMin());
        System.out.println("\nHi " + player1.getName() + "!");

    }

    private void checkChangingRoom()
    {
        if (current.getRoomNumber() > 1)
        {
            if (!player1.isWearSuit())
            {
                System.out.println("\nYou collected a total of " + player1.getCache() + " Eridium");
                System.out.println("GAME OVER!");
                System.exit(0);
            }
        }
    }
    
    private void checkMonster() {
        
        String combatAnswer = "";
        Scanner scan = new Scanner(System.in);
        
        
        if(current.getRoomMonster() != null) {
            System.out.println(current.getRoomMonster().getMonsterDescriptoin());
            while(current.getRoomMonster().getMonsterHp() > 0) {
                System.out.println("What will you do?");
                combatAnswer = scan.nextLine();
                if (combatAnswer.equalsIgnoreCase("attack")) {
                combat.fightOneRound(player1, current.getRoomMonster() );
                } else if (combatAnswer.equalsIgnoreCase("run")) {
                    System.out.println("You avoid the monster but the monster hits you once and you loose 10 hp!");
                    player1.setHp(player1.getHp()-10);
                    System.out.println("Player hp: " + player1.getHp());
                    break;                    
                } else System.out.println("That is not an option!");
            } current.clearRoomMonster();
        }
    }
    
}
