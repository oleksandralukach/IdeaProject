package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Map_1 {
    /**
     * Map is an Interface that's part of Java Collections Framework
     * Map stores Objects in Key, Value pair aka entry
     *
     * Map interface has 3 implementations:
     * - Hashmap<K,V> -> without any orders of the keys allows one null key
     * - LinkedHashMap<K,V> -> orders elements in inserted order of the entries, allows one null key
     * - TreeMap<K,V> -> orders it's elements in natural order of the keys, does not allow null key
     */
    public static void main(String[] args) {

        String ssnElena = "011-10-1000";
        String nameElena = "Elena Sova";

        ArrayList<String> infoElena = new ArrayList<>();
        infoElena.add(ssnElena);
        infoElena.add(nameElena);

        int indexOfSsn = infoElena.indexOf("011-10-1000");
        System.out.println("Here is the name associated with ssn "+ infoElena.get(indexOfSsn+1));

        // <key, value>
        // value can be a collection
        Map<String,String> map = new HashMap<>();
        map.put("2222222", "Karishma");

        String name = map.get("2222222");
        System.out.println("The name associated with key is "+ name);

        map.put("1111111", "Fahad");
        map.put("0000000", "Karishma");
        System.out.println(map);

        //when we put() method with existing key
        // then we will just update the value associated with that key
        map.put("2222222", "Alex");
        System.out.println(map);

    }
}
