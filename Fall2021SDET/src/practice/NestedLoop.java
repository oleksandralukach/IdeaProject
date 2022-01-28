package practice;

public class NestedLoop {

    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println("====================================");

        for (int i = 1; i < 7; i++) {
            for (int y = 1; y <= 5; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("====================================");

        for (int in = 0; in < 5; in++) { // 5 rows
            for (int j = 3; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

