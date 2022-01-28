package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodWhichTakesIntArrayAsParam {

    public static ArrayList<String> returnNameOfStudent (int[] studentId){

       ArrayList<String> name = new ArrayList<>(Arrays.asList("Fahad", "Alex"));

       return name;
    }
}
