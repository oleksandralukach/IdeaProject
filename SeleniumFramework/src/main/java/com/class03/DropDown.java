package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        // Create element pointing to <Select> tag
        WebElement catDropDown = driver.findElement(By.id("gh-cat"));

        // Select class we use only for dropDown
        // Create object of select class and pass web element as constructor parameter
        Select catDropDownSelect = new Select(catDropDown);

        Thread.sleep(5000); //wait for 5 sec// need to declare exception in method
        catDropDownSelect.selectByIndex(4); //position - int

        Thread.sleep(5000); //wait for 5 sec
        catDropDownSelect.selectByValue("267"); //value of attribute - String

        Thread.sleep(5000); //wait for 5 sec
        catDropDownSelect.selectByVisibleText("Books"); //text - String

        // Create a list of all options in dropDown using .getOptions()
        List<WebElement> listOfDropDown = catDropDownSelect.getOptions();

        // iterating through each element and printing them as a text
        for(WebElement e : listOfDropDown){
            System.out.println(e.getText());
        }
//        Iterator<WebElement> it = listOfDropDown.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next().getText());
//        }

    }
}
