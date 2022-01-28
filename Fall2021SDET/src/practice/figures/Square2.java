package practice.figures;

public class Square2 {

    public static void main(String[] args) {

        //11111
        //22222
        //33333
        //44444
        //55555

        for (int i = 1; i <= 5; i++) { // i = 1 om first iteration and then it goes inside inner loop
            for (int j = 1; j <= 5; j++) { //and iterate it 5 times
                System.out.print(i); //(11111 on first iteration of outer loop)
            }
            System.out.println();
        }
    }
}
