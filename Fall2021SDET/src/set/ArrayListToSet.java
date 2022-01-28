package set;

import java.util.*;

public class ArrayListToSet {

    public static void main(String[] args) {

//====================================================================================================

        //by passing list as a parameter of Set:
        List<String> names = Arrays.asList("David", "Ola", "David", "Elon", "John");
        System.out.println(names + " " + names.size());

        Set<String> nameSet = new HashSet<>(names); // it will delete not unique names (no duplicate elements)
        System.out.println("Unique names from the set:" + nameSet + " " + nameSet.size());

//==========================================================================================================

        // using foreach loop and assigning each element of list to Set:
        List<Integer> nums = Arrays.asList(1,4,6,8,9);
        Set<Integer> numsUnique = new HashSet<>(nums);
        for (Integer n : nums) {
            numsUnique.add(n);
        }
        System.out.println(numsUnique);

        // using for loop and assigning each element of list to Set:
        for (int i = 0; i < nums.size(); i++) {
            numsUnique.add(nums.get(i));
        }

        System.out.println(numsUnique); //[14689]

        List<Integer> numsList = new ArrayList<>(numsUnique);
        System.out.println(numsList); //[14689]
// ============================================================================================

        // Set to List
        Set<String> carMakers = new HashSet<>();
        carMakers.add("Mazda");
        carMakers.add("Cadillac");
        carMakers.add("Ford");

        List<String> names2 = new ArrayList<>(carMakers);
        System.out.println(names);

        //=================================================================
        Short[] nums1 = {12, 54, 67, 25, 97};
        Short[] nums2 = {12, 54, 67, 25, 97};
        Short[] nums3 = {12, 54, 67, 25, 97, 54};

        Set<Short> setAge = new HashSet<>();

        System.out.println(setAge.addAll(Arrays.asList(nums1)));
        System.out.println(setAge.addAll(Arrays.asList(nums2)));
        System.out.println(setAge.addAll(Arrays.asList(nums3)));

    }
}
