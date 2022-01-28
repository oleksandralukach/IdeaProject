package practice.figures;

public class FullTriangle {

    //     *   // 1
    //    ***
    //   *****
    //  *******
    // *********

    public static void main(String[] args) {

        // 5
        // 4
        // 3
        // 2
        // 1


        for (int i = 1; i <= 5; i++) { //rows from 1 to 5 included

            for (int s = 5; s >= i; s--) { // spaces before stars
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) { //stars
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = 1; i <= 10; i++) { //rows
            // begging point; ending point; update

            for (int s = 1; s <= 10 - i; s++) { //spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) { // columns (each element on dif positions on one row)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

