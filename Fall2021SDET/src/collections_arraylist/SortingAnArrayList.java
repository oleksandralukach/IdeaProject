package collections_arraylist;

import java.util.*;

public class SortingAnArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(6);

        Collections.sort(nums); // ascending order
        Collections.sort(nums, Collections.reverseOrder()); // reverse order

        nums.sort(Comparator.naturalOrder()); // ascending order
        System.out.println(nums);
        nums.sort(Comparator.reverseOrder()); // reverse
        System.out.println(nums);


        //=====================================

        List<String> citiesList = Arrays.asList("Chicago","San Francisco","San Diego","Buffalo", "Denver");

        System.out.println("Before sorting: "+ citiesList);

        //sort() method is a static
        Collections.sort(citiesList);
        System.out.println("After sorting: "+ citiesList);

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(12, 34, 56, 67, 86, 65));
        System.out.println("Before sorting: " + num);

        Collections.sort(num);
        System.out.println("After sorting: "+ num);

        int maxNum = Collections.max(num);
        System.out.println("Max: "+ num);

        int minNum = Collections.min(num);
        System.out.println("Min: "+ num);

        int[] arr = {3, 4, 5, 1, 3};
        Arrays.sort(arr);

        int max = 0; // or arr[0]

        for (int i : arr){
            if (i > max){ // when i (every element) bigger than max that it will get assign to max
                // and then only bigger number than max wil get assigned
                max = i;
            }
        }
        System.out.println(max);

        Arrays.sort(arr);
        int max2 = arr[arr.length -1];

        System.out.println("The max is "+ max2);
        System.out.println("The min is:" + arr[0]);
        System.out.println("The biggest 3 elements:" + arr[arr.length-1]+ " "
                + arr[arr.length-2] + " " + arr[arr.length-3]);

        List<Integer> numberList = Arrays.asList();
       for(int i : arr){
           numberList.add(i);
       }
    }
}
