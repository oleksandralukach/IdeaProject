package file_reader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Stack;

public class WriteFile {

    public static void main(String[] args) {
        writeToFile("Text I pass", "path");
    }

    // Throws keyword declares in the method signature:
    // I want method that will call writeToFile method to handle the issue.
    // I think they will be better places to handle it
    public static void writeToFile(String txt) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\Oleksanda\\IdeaProjects\\Fall2021SDET\\src\\file_reader\\test.txt");
        fileWriter.write("Hello");
        fileWriter.close();
    }

    public static void writeToFile(String txt, String path) {
        try {
            writeToFile("great text is here");
        } catch (IOException e) {
            System.out.println("In catch block");
        }

    }
}
