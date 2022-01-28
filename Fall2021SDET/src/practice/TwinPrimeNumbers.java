package practice;

import java.util.ArrayList;

/**
 * Write a Java method to find all twin prime numbers less than 100
 */
public class TwinPrimeNumbers {
    public static ArrayList<Integer> findPrimeNumbers() {
        ArrayList<Integer> primeNums = new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) {
                primeNums.add(i);
            }
        }
        return primeNums;
    }
    public static void printTwinPrimeNums(ArrayList<Integer> primeNums) {
        for (int i = 0; i < primeNums.size()-1; i++) {
            if (primeNums.get(i+1) - primeNums.get(i) == 2) {
                System.out.print(primeNums.get(i) + " ");
                System.out.print(primeNums.get(i + 1));
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> primeNums = new ArrayList<>(findPrimeNumbers());
        printTwinPrimeNums(primeNums);
    }
}

//        for (int i = 1; i < nums.size(); i++) {
//            int counter = 0;
//            for (int num = 2; num <= nums.get(i)/2; num++) {
//                if (nums.get(i) % num == 0) {
//                    return false;
//                }
//            }

//        for (int i = 1; i <= 100; i++) {
//            int counter = 0;
//
//            for (int num = i; num >=1 ; num--) {
//                if (i % num == 0){
//                    counter += 1;
//                }
//            }
//            if(counter == 2){
//                primeNumbers += i + " ";
//            }
//        }
//            System.out.println(primeNumbers);