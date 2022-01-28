package oop.class10Throw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UseOfThrows {
    public static void main(String[] args) throws Exception {
        int a = 10, b = 0;
        method1();
    }
    public static void method1() throws Exception {
     method2();
    }

    public static void method2() throws FileNotFoundException {
        int a = 1;
        if (a!=0){
            throw new FileNotFoundException("a is not zero");
        }}

    public static void method3() throws Exception {
        method1();
    }
}
