package collections_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToListOfStrings {
    public static void main(String[] args) {
        String[] names = {"Elon", "John", "Steve"};

        //convert names to List
        //now NamesList and namesArr are storing the same reference
        //ex: names[0] and namesList.get(0) -> are pointing to the same object
        //in the heap
        // list is fixed size
        //changes affect each other
        List<String> namesList = Arrays.asList(names);
        //List<String> namesList = new ArrayList<>(Arrays.asList(names)); //this way it's also will be dynamic
        // and can change independently
        System.out.println(Arrays.toString(names));
        System.out.println(namesList);

        names[2] = "Bill";
        System.out.println(Arrays.toString(names));
        System.out.println(namesList);

        // another constraint of creating list using Arrays.asList()
        // the list is fixed size

        //namesList.add("Jeff"); //UnsupportedOperationException (we can not add bc size is fixed)
        //System.out.println(namesList);

        //creating dynamic list by passing existing to params of new List
        //List<String> namesList = new ArrayList<>(Arrays.asList(names)); //this way its also will be dynamic
        List <String> namesListDynamic = new ArrayList<>(namesList);
        System.out.println(namesListDynamic);
        namesListDynamic.add(1,"Jeff");
        System.out.println(namesListDynamic);
        System.out.println(namesList);


        //======================================

        String[] animalsArray = {"Lion", "Wolf", "Penguin", "Bear", "Dolphin"};

        List<String> animalList = Arrays.asList(animalsArray);

        System.out.println(animalList);
    }
}
