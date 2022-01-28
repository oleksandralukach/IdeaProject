package oop.class8Abstarction;

abstract class Page{
    public abstract void openPage();
    public abstract void waitForPageToLoad();
    public void scrollDown(){ // not abstract bc it common for every class that extends this class

    }
}
class LoginPage extends Page{

    public void openPage(){
        //code to open login page
    }
    @Override
    public void waitForPageToLoad(){
        //code to wait for some elements to load
    }
}

class HomePage extends Page{

    @Override
    public void openPage() {
        //code to home page
    }

    @Override
    public void waitForPageToLoad() {
//code to check home page loaded successfully
    }
}
public class AbstractClassPageEx {
}
