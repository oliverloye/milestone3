
package dungeon;

import java.util.ArrayList;



public class Room {
    
    
    
    
    private int numberOfDoors;
    private int roomNumber;
    //int mats = ThreadLocalRandom.current().nextInt(1, 4 + 1);;
    private final String description;
    private String hint;
    private int numberOfEridium;
    private ArrayList<Item> treasure;
    
    public Room north;
    public Room east;
    public Room south;
    public Room west;

    public Room(int door, int roomNumber, String description, String hint, int numberOfEridium, Item item) {
        this.numberOfDoors = door;
        this.roomNumber = roomNumber;
        this.description = description;
        this.hint = hint;
        this.numberOfEridium = numberOfEridium;
        north = null; 
        south = null; 
        west = null; 
        east = null;
        treasure = new ArrayList<>();
        treasure.add(item);
    }

    public void add( Item item ){
        treasure.add(item);
    }
    
    public ArrayList<Item> getAllItems(){
        return treasure;
    }
    
    
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDescription() {
        return description;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfEridium() {
        return numberOfEridium;
    }

    public void setNumberOfEridium(int numberOfEridium) {
        this.numberOfEridium = numberOfEridium;
    }
    
    @Override
    public String toString() {
        return "Room{" + "numbersOfDoors=" + numberOfDoors + ", roomNumber=" + roomNumber + '}';
    }
}
