package dungeon;

import java.util.ArrayList;

public class Room
{

    private int numberOfDoors;
    private int roomNumber;
    //int mats = ThreadLocalRandom.current().nextInt(1, 4 + 1);;
    private final String description;
    private String hint;
    private int numberOfEridium;
    private final ArrayList<Item> roomTreasure = new ArrayList<Item>();

    public Room north;
    public Room east;
    public Room south;
    public Room west;

    public Room(int door, int roomNumber, String description, String hint, int numberOfEridium)
    {
        this.numberOfDoors = door;
        this.roomNumber = roomNumber;
        this.description = description;
        this.hint = hint;
        this.numberOfEridium = numberOfEridium;
        north = null;
        south = null;
        west = null;
        east = null;
    }

    public ArrayList<Item> getRoomTreasure() {
        return roomTreasure;
    }
    
    //Vi skal have en metode til at clear vores item liste  "clearRoomTreasure"
    public void clearRoomTreasure() {
        roomTreasure.clear();
    }
    
    public void add(Item item)
    {
        roomTreasure.add(item);
    }

    

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public String getDescription()
    {
        return description;
    }

    public String getHint()
    {
        return hint;
    }

    public void setHint(String hint)
    {
        this.hint = hint;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfEridium()
    {
        return numberOfEridium;
    }

    public void setNumberOfEridium(int numberOfEridium)
    {
        this.numberOfEridium = numberOfEridium;
    }

    @Override
    public String toString()
    {
        return "Room{" + "numbersOfDoors=" + numberOfDoors + ", roomNumber=" + roomNumber + '}';
    }
}
