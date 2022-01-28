package forLoop;

public class NestedForLoop {

    /*
    Loops can have unlimited number of inner loops but more than 3 is
    not recommended simply just divide them into separate loops
     */

    public static void main(String[] args) {

        // printing out the timetable by using for loop

        // outer for loop will represent the rows
        // inner for loop is for columns

        for (int i = 1; i <= 5; i++){ // outer loop

            for (int j = 1; j < 10; j++){ // inner loop
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
