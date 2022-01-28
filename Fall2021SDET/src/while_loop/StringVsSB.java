package while_loop;

public class StringVsSB {

    // input from user
    // and modify the text with wrapping each word with {}

    //ex: Hello World -> {Hello} {World}
    //if you have a task

    public static void main(String[] args) {

        String alphabet = "ABCDEFGHI.....";

        // By using String each iteration when we're going to add letter to String (update String)
        // new object will be created each time.
        // With SB We can modify the original object
        // which avoids creating too many String objects in the heap memory.

        StringBuilder sb = new StringBuilder("ABC");
        int i = 3;

        while (i < alphabet.length()){
            sb.append(alphabet.charAt(i));
            // sb += alphabet.charAt(i); // using String -> new object each iteration
            i++;
        }
        System.out.println(sb);
    }
}
