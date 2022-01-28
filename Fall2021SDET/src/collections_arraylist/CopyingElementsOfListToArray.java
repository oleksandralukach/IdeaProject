package collections_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CopyingElementsOfListToArray {

    public static void main(String[] args) {

        ArrayList<Integer> idsList = new ArrayList<>(Arrays.asList(1221, 3445, 8969, 474546));
        System.out.println(idsList);

        ArrayList<Integer> idsListCopy = new ArrayList<>(idsList);
        System.out.println(idsListCopy);

        idsListCopy.set(2, 6788); // will affect both arraylists
        System.out.println(idsListCopy);
        System.out.println(idsList);

        int[] idsArray = new int[idsList.size()];


        for (int i = 0; i < idsListCopy.size(); i++){
            idsArray[i] = idsListCopy.get(i);
        }

        System.out.println(Arrays.toString(idsArray));
    }
}
