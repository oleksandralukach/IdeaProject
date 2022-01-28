package collections_arraylist;

import java.util.ArrayList;

public class ArrayListWithIntegers {

    public static void main(String[] args) {

        ArrayList<Integer>testScores = new ArrayList<>();

        testScores.add(96);
        testScores.add(75);
        testScores.add(68);
        testScores.add(90);

        //testScores.set(index, element) - replace the element

        Integer a = 22;
        testScores.remove(a); // or:
        testScores.remove((Integer) 96); // wrap it
        testScores.remove(2);


        System.out.println(testScores);

        testScores.add(2, testScores.get(1) + 5);
        System.out.println(testScores);

        // set(index, value)
        testScores.set(1, 55);
        System.out.print(testScores);
        System.out.println();

        for (int i = 0; i < testScores.size(); i++){
            System.out.print(testScores.get(i));
        }
        System.out.println();

        for(int i : testScores){
            System.out.print(i);
        }
        System.out.println();

        testScores.forEach(System.out::println);
    }
}
