package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySetStudentScores {
    public static void main(String[] args) {

        Map<String, Double> scoresMap = new HashMap<>();
        scoresMap.put("Elon", 99.0);
        scoresMap.put("Messi", 89.0);
        scoresMap.put("Bill", null);
        scoresMap.put(null, null);
        scoresMap.put(null, 100.0); // the last one will be saved to key "null"
        System.out.println(scoresMap.get("Elon")); // 99.0

        Set<String> scoresKeys = scoresMap.keySet();//returns keys
        System.out.println(scoresKeys); //["Elon", "Bill", "Messi", null]

        //loop over scores keys:
        for (String key:scoresKeys) {
            System.out.println(key + " : " + scoresMap.get(key));
        }

    }
}
