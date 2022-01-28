package practice.oop.complex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//create a method which takes list of rooms and print out info about available rooms
//out:
//1. 1bd, 1bath, 1 King bad
//2. 2bd, 2bath, 1 King Bad, 1 Queen bed

//create a method which will book a room
//method will take List<Rooms>, int beds, int baths
//and print out rooms which are available for this criteria
//Room number: 100 - 1bd, 1bath, 1 King bed
//Room number: 101 - 1bd, 1bath, 2 Queen bed
//Which room would you like to book
//give a room number
//101
//at the end of the method return allRooms
//public static void bookARoom(List<Room> allRooms, int beds, int baths)


public class HyattApp {
    public static void main(String[] args) {

        // room #1
        Map<String, Integer> bedTypesMap1 = new HashMap<>();
        bedTypesMap1.put("King, ", 1);
        Room room1 = new Room(100, 1, 1, bedTypesMap1, true);

        //room #2
        Map<String, Integer> bedTypesMap2 = new HashMap<>();
        bedTypesMap2.put("King, ", 1);
        bedTypesMap2.put("Queen, ", 1);
        Room room2 = new Room(200,2, 2, bedTypesMap2, true);

        //room #3
        Map<String, Integer> bedTypesMap3 = new HashMap<>();
        bedTypesMap3.put("Queen, ", 1);
        Room room3 = new Room(300,1, 1, bedTypesMap3, false);

        List<Room> listOfRooms = new ArrayList<>();
        listOfRooms.add(room1);
        listOfRooms.add(room2);
        listOfRooms.add(room3);

        printListOfAvailableRooms(listOfRooms);

    }

    static void printListOfAvailableRooms(List<Room> listOfRooms) {

        for (int i = 0; i < listOfRooms.size(); i++) {
            if (listOfRooms.get(i).isAvailable){
                System.out.print((i+1) + ". ");
                System.out.println(listOfRooms.get(i).roomNumber + "#");
                System.out.print(listOfRooms.get(i).beds + " bd, ");
                System.out.print(listOfRooms.get(i).baths + " bath, ");
                System.out.print(listOfRooms.get(i).bedType);
                System.out.println();
            }
        }
    }
}
