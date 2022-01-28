package while_loop;

public class Practice {

    public static void main(String[] args) {
        int i = 1;

        while (i <= 5)
            System.out.println(i);
        i++;

        // while( i >= 5); -> to end the statements, and then it will be infinite

        int i1 = 1; // i = 1
        int j = i1; // j = 1

        while (i <= j){ // j as 1 (constant, we're not changing)
            System.out.println(i);
            i++;

        }

        while (i <= 1){
            i++;
        }

        System.out.println(i);


    }
}
