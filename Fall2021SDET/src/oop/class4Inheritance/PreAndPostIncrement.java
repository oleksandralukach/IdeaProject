package oop.class4Inheritance;

public class PreAndPostIncrement {
    public static void main(String[] args) {

        int i = 1;
        int j = i++; // 2 operations - assigning and incrementing
        //first assigning than incrementing
        // ++i prefix -> first incrementing than assigning

        System.out.println(i); // 2
        System.out.println(j); // 1

        int result = i++ + 7;// 8 -> first i+7 than assigning than increment
        System.out.println(result);

    }
}
