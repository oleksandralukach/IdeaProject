package while_loop;

public class DoWhileLoop1 {

    // do while loop guaranteed to run at least once without checking condition unlike while loop

//        do { // execute the body without checking the condition in first iteration
//             // body of the loop
//        }while ( //condition);

    public static void main(String[] args) {

        boolean run = false;

        while (run){ // not going to run at all
            System.out.println("Run Forest Run");
        }

        int counter = 0;
        while (counter > 1){ // not going to run at all
            System.out.println("Run Forest Run");
        }

        // =============================================================

        boolean run1 = false;

        do { // once
            System.out.println("Run Forest Run3");

        } while(run1);

        // =============================================================

        int in1 = 0;

        do { // once
            System.out.println("Run Forest Run3");

        } while(in1 > 1);

        // =============================================================

        // print text 5 times
        int counter2 = 0;

        do {
            System.out.println("Run Forest Run3");
            counter2++;

        } while(counter2 < 5);


    }
}
