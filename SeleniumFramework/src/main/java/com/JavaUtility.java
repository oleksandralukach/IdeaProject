package com;

public class JavaUtility {
    public static void main(String[] args) {

        // to get your OS:
        System.out.println(System.getProperty("os.name"));
        //user working directory(so we can append it instead of hardcoding, so we can use it on different machines):
        System.out.println(System.getProperty("user.dir"));
        // to get file separator (so we can use it for different OS):
        System.out.println(System.getProperty("file.separator"));


    }
}
