package mentoring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingWithScanner {

    public static void main(String[] args) throws FileNotFoundException {

        // example
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\Oleksanda\\Desktop\\NewTextDocument.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine())
            System.out.println(scan.nextLine());

        //

//        String contentOfFile = "";

//        while (scan.hasNextLine()) {
//            contentOfFile = contentOfFile + (scan.nextLine() + " \n ");
//        }

//        System.out.println(contentOfFile);

        List<String> zipcodes = new ArrayList<>();

        for (String line : zipcodes) {
            System.out.println(line);
        }
    }
}
