package oop.class4Inheritance;

import java.util.*;
import java.lang.*;
import java.io.*;

// Java program to illustrate the
// concept of Hierarchical inheritance
public class InheritancePractice {
    public static void main(String[] args) {
        three g = new three();
        g.print_geek();
        two t = new two();
        t.print_for();
        g.print_geek();
    }
}

class one {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

class two extends one {
    public void print_for() {
        System.out.println("for");

    }
}

class three extends one {
    public void print_for() {
        System.out.println("geeks");
    }
}

