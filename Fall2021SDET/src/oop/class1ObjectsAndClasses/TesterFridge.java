package oop.class1ObjectsAndClasses;

public class TesterFridge {

    public static void main(String[] args) {

        Fridge f1 = new Fridge();
        Fridge f2 = new Fridge();

        f1.model = "SMEG";
        f1.yearOfBuild = 2019;
        f1.color = "Yellow";
        f1.amountOfIce = 200;

        f1.printFridgeInfo();

        f1.createIce(f1.amountOfIce);

        f2.model = "Samsung";
        f2.yearOfBuild = 2012;
        f2.color = "Silver";
        f2.amountOfIce = 100;
    }
}
