package oop.class1ObjectsAndClasses;

public class Fridge {

    String model;
    double price;
    int size;
    String color;
    int yearOfBuild;
    int amountOfIce;

    public void freeze(){}
    public void setTemperature(){}
    public void createIce(int amountOfIce){
        System.out.println("Generate amount of ice(grams per hour): " + amountOfIce);
    }
    public void printFridgeInfo(){
        System.out.println("Model: " + model);
        System.out.println("Year: " + yearOfBuild);
        System.out.println("Color: " + color);
    }
}
