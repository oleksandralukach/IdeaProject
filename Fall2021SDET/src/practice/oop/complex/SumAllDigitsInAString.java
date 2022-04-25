package practice.oop.complex;

public class SumAllDigitsInAString {
    public static void main(String[] args) {
        System.out.println(findSumOfAllDigitsInAString("12 Alex63"));
    }

    public static int findSumOfAllDigitsInAString(String str){

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }

        return sum;
    }
}
