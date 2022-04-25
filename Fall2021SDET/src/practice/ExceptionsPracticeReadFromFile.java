package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsPracticeReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("C:\\Users\\Oleksanda\\Desktop\\NewTextDocument2.txt");
        Scanner scan = new Scanner(inputFile);
        int totalIncome = 0;

        try {
            while (scan.hasNext()) {
                totalIncome += scan.nextInt();
            }
            System.out.println(totalIncome);

        } catch (InputMismatchException e) {
            System.out.println("Non-numeric data encountered " +
                    "in the file.");
            scan.nextLine();
        } finally {
            totalIncome = 35;
            System.out.println(totalIncome);
        }
    }
}

