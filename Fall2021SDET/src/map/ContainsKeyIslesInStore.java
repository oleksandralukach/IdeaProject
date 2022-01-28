package map;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyIslesInStore {

    public static void main(String[] args) {

        //containsKey(Object key) -> return true if the map contains specified key
        Map<Byte, String> islesMap = new HashMap<>();
        islesMap.put((byte) 2, "Pharmacy");
        islesMap.put((byte) 3, "Home Goods");
        islesMap.put((byte) 4, "Veggies");
        islesMap.put((byte) 5, "Toys");
        System.out.println(islesMap);

        boolean hasKeyFour = islesMap.containsKey((byte)4);
        System.out.println("Does this map contain key 8? " + hasKeyFour); //true
        boolean hasKeyTen = islesMap.containsKey((byte)10);
        System.out.println("Does this map contain key 8? " + hasKeyTen); //false
    }
}
