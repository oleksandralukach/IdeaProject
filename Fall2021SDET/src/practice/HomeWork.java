package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HomeWork {

    public static void main(String[] args) {

        int target = 9;
        Integer[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(findTargetElements(arr, target)));


    }
    public static int[] findTargetElements(Integer[] arr, int target) {

        int[] valueResult = new int[2];
        int[] keyResult = new int[valueResult.length];

        for (int k = 0; k < arr.length; k++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[k] != arr[j]) {
                    if (arr[k] + arr[j] == target) {
                        valueResult[0] = arr[j];
                        valueResult[1] = arr[k];
                        break;
                    }
                }
            }
        }

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
        for (int m = 0; m < valueResult.length; m++) {
            for (Integer x :map.keySet()) {
                if (map.get(x).equals(valueResult[m])) {
                    keyResult[m] = x;
                }
            }
        }
        return keyResult;
    }
}
