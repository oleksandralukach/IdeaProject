package oop.class7Encapsulation;
class Bank{
    void displayRate(){
        System.out.println("");
    }
}

public class HSBCBank extends Bank{ //overridden method
    void displayRate(){
        System.out.println("1.3");
    }
}

class CitiBank extends Bank{ //overridden method
    void displayRate(){
        System.out.println("6");
    }
}

class Chase extends Bank{ //overridden method
    void displayRate() {
        System.out.println("6");
    }
}
