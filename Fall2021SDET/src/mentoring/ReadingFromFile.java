package mentoring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {

        // Reading file from path in local directory
        FileReader file = new FileReader("C:\\Users\\Oleksanda\\Desktop\\NewTextDocument2.txt");

        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);


        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 4; counter++)
            System.out.println(fileInput.readLine());

        // Closing file connections
        // using close() method
        fileInput.close();
    }

//    public static void main(String args[])
//    {
//        // Here we are dividing by 0
//        // which will not be caught at compile time
//        // as there is no mistake but caught at runtime
//        // because it is mathematically incorrect
//        int x = 0;
//        int y = 10;
//        int z = y / x;


}


