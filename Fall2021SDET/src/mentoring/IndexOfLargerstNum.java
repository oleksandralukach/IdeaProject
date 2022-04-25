package mentoring;

public class IndexOfLargerstNum {
    public static void main(String[] args) {
       /*
        Task: Process array and return index of the largest number
        Q you should ask:
        PO requirements: return type, negative number, special characters
        */

        //Character.isDigit()
        //Integer.parseInt();

        String[] mixedUpStr = {"999", "hello", "1", "Goodbye", "-3", "Word", "-22", "66", "99"};

//        if ( mixedUpStr == null || mixedUpStr.length == 0 )  // null or empty
//        {return -1;}
            int result = -1;
        int storedIndex = Integer.MIN_VALUE;

        for (int i = 0; i < mixedUpStr.length; i++) {
            try {
                int temp = Integer.parseInt(mixedUpStr[i]); //parse and then compare and store it as a result
                result = i;
                if (temp > storedIndex) {
                    storedIndex = temp;
                    result = i;
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        System.out.println(result);
    }
}