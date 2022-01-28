package oop.class4Inheritance;

public class BasicPhone {

    public void call(String number) {
    }

    public void text(String number, String text) {
    }
}

class SmartPhone extends BasicPhone{
    BasicPhone basic = new BasicPhone();

    public void takePhoto() {
    }

    public void takeVideos() {
    }
}