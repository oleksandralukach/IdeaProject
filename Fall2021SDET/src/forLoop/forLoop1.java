package forLoop;

public class forLoop1 {

    /*
     * For loop statements are used when we know the number of times the loop
     * needs to iterate over. The structure is:
     * for (initialization; boolean expression; update of the value){
     *  statement(s);
     * }
     *
     * first the variable needs to get initialized, then we validate the expression to see if it
     * evaluates to true, if yes then we execute the body of for loop, and after the end of
     * for loop body statement(s) we update the value of the variable and then check the expression again
     * before executing the body of for loop.
     *  */

    public static void main(String[] args) {

        int maxNum = 10;

        for(int i = 1; i <= maxNum; i++){
            System.out.println(i);
        }
    }
}
