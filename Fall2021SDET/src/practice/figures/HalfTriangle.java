package practice.figures;

public class HalfTriangle {


    // 1
    // 12
    // 123
    // 1234
    // 12345

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //     1 one iteration of inner loop
        //    12 second iteration of inner loop
        //   123
        //  1234
        // 12345

        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j > i ; j--) { //to print the space first iteration 4 spaces, then 3, 2 and 1
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) { // to print certain amount of elements in a row
                System.out.print(j);
            }
            System.out.println("");
        }

        //     1
        //    11
        //   111
        //  1111
        // 11111

        for (int i = 1; i <= 5 ; i++) {

            for (int s = 5; s > i ; s--) { // or: for(int s = 1; s <= 5-i; s++) s = 5-i(5 spaces for element minus i-taken element by number) The rest - blank spaces
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }

    }

}
