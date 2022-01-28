package practice.oop.complex;

import java.util.Map;

public class Room {
    //create a method which takes list of rooms and print out info about available rooms
    //out:
    //1. 1bd, 1bath, 1 King bad
    //2. 2bd, 2bath, 1 King Bad, 1 Queen bed

    //create a method which will book a room
    //method will take List<Rooms>, int beds, int baths
    //and print out rooms which are available for this criteria
    //with ascending number
    //public static void bookARoom(List<Room> allRooms, int beds, int baths)


    int beds;
    int baths;
    Map<String,Integer> bedType;
    boolean isAvailable;
    int roomNumber;

    public Room(int roomNumber, int beds, int baths, Map<String,Integer> bedType, boolean isAvailable){
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.baths = baths;
        this.bedType = bedType;
        this.isAvailable = isAvailable;
    }
}
