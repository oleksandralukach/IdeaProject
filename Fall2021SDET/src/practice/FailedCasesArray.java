package practice;

import java.util.*;

public class FailedCasesArray {
    public static void main(String[] args) {
        String[] arrays = {
                "CHROME_92, pass, /test/src/resources/bar.test.js",
                "CHROME_91, fail, /test/src/resources/fizz.test.js",
                "CHROME_91, fail, /test/src/resources/fizz.test.js",
                "CHROME_90, pass, /test/src/resources/buzz.test.js",
                "CHROME_90, fail, /test/src/resources/buzz.test.js",
                "SAFARI_92, pass, /test/src/resources/bar.test.js",
                "SAFARI_92, fail, /test/src/resources/zest.test.js"
        };

        Map<String, Integer> arrayFailed = new HashMap<>();
        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i].contains("fail")) {
                //By ternary operator:
                // arrayFailed.put(arrays[i], arrayFailed.containsKey(arrays[i]) ? arrayFailed.get(arrays[i]) + 1 : 1);

                if (arrayFailed.containsKey(arrays[i])){
                    arrayFailed.put(arrays[i], arrayFailed.get(arrays[i]) + 1);
                }else
                    arrayFailed.put(arrays[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : arrayFailed.entrySet()) {
            System.out.println(entry);
        }

    }

}

