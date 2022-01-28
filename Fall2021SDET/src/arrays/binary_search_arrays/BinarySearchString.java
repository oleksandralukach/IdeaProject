package arrays.binary_search_arrays;

import java.util.*;

public class BinarySearchString {

    public static void main(String[] args) {

        String[] school = new String[]{"Devx", "ITschool", "ITI"};
        System.out.println("Before sorting index of ITI: " + Arrays.toString(school) + Arrays.binarySearch(school, "ITI"));

        Arrays.sort(school);
        System.out.println("After sorting index of \" ITI\" " + Arrays.toString(school) + Arrays.binarySearch(school, "ITI"));

        //============================================================
        //Sort arrays of primitive types in descending order
        int[] nums = new int[7];
        nums[1] = 6;
        nums[3] = 3;
        nums[4] = 8;
        Arrays.sort(nums);

//        for (int left=0, right=nums.length-1; left<right; left++, right--) {
//            // exchange the first and last
//            int temp = nums[left];
//            nums[left]  = nums[right];
//            nums[right] = temp;
//        }
        //or to just print
//        for(int i = nums.length-1; i>=0; i--) {
//            System.out.println(nums[i]);}

        Collections.sort(Arrays.asList(nums), Collections.reverseOrder()); //???
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.stream(nums).findFirst());


        //=====================================================

        //Sort arrays of primitive types in descending order
        double[] array = new double[1048576];
        Arrays.stream(array).boxed().sorted(Collections.reverseOrder());

         //=============================================================
        //Sort list in descending order
        List<String> school2 = new ArrayList<>();
        school2.add(school[0]);
        school2.add(school[1]);
        school2.add(school[2]);
//      school2.sort(Collections.reverseOrder());
        Collections.reverse(school2);
        //Collections.sort(school2, Collections.reverseOrder());
        System.out.println(school2);


        //===============================
        //stream methods
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // Let's try the imperative style first(which we
        // are familiar with)
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++)
            sum2 += arr[i];
        System.out.println("Average using iteration :" +
                (sum2 / arr.length));

        // Let's try the declarative style now
        sum2 = Arrays.stream(arr) // Step 1
                .sum(); // Step 2
        System.out.println("Average using streams : " +
                (sum2 / arr.length));

        // forEach()
        // It iterates through the entire streams
        System.out.println("Printing array elements : ");
        Arrays.stream(arr)
                .forEach(e -> System.out.print(e + " "));

    }

}
