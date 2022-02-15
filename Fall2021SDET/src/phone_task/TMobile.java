package phone_task;

import java.util.Arrays;

public class TMobile {
    public static void main(String[] args) {
        /**
         * Interview Tasks Breakdown:
         * Input specification --> int budget , array[] timeSpent
         * Sudo code// examples
         * Logic/rules --> what you have to achieve
         * Output specification -->{0,900}
         */
        /*
        Bob is a businessman making phone calls to sell items in his business
        he also has a budget, He should not go over his budget, although
        sometimes he does. Calculate his standard calls ("STD") and his local calls ("local") and his
        International calls ("ISD") to figure out how much he spent and if he went over his budget
        return a 1 if he went over his budget and a 0 if he did not go over his budget. also return how much he spent
        or if he went over his budget return how much he went over his budget. SEE the examples for output specification

        EXAMPLE 1.
        input -> {100,100,100}
        input2 -> 1200
        example output --> {0,1125}

        Example 2.
        input1 -> {100,100,200}
        input2 -> 1200
        Output -> {1,925}
         */

        int [] callsMade = {100,100,100};
        int budget = 1200;
        System.out.println(Arrays.toString(phoneUsage(callsMade,budget)));

    }

    public static int [] phoneUsage(int[] callsMadeArr,int budget){
        TypeOfCall local = new Local(callsMadeArr[0]); //calls
        TypeOfCall std = new STD(callsMadeArr[1]); //100 calls
        TypeOfCall isd = new ISD(callsMadeArr[2]); //100 calls

        //TODO WRITE YOUR CODE HERE
        int[] monthResultArr = new int[2];

        double localMoneySpent = local.amountUsed();
        double stdMoneySpent = std.amountUsed();
        double isdMoneySpent = isd.amountUsed();

        double totalSpentForAllCalls = localMoneySpent + stdMoneySpent + isdMoneySpent;
        if (totalSpentForAllCalls > budget){
            monthResultArr[0] = 1;
            monthResultArr[1] = (int) (totalSpentForAllCalls - budget);
        } else {
            monthResultArr[0] = 0;
            monthResultArr[1] = (int) totalSpentForAllCalls;
        }


        return null;
    }
}
