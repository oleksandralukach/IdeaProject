package oop.class4Inheritance;

public class BasicPhoneTester {
    public static void main(String[] args) {

        BasicPhone basic = new BasicPhone();
        SmartPhone smart = new SmartPhone();
        basic.call("12345");
        basic.text("12345","Hello");

        smart.call("12345");
        smart.text("12345","Hello from Smartphone");
        smart.takePhoto();
        smart.takeVideos();


    }
}
