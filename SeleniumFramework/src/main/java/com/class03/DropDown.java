package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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

        Assert.assertEquals(listOfDropDown.size(), 36);

//        Iterator<WebElement> it = listOfDropDown.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next().getText());
//        }

        List<WebElement> selectedOptions = catDropDownSelect.getAllSelectedOptions();
        Assert.assertTrue(selectedOptions.size() == 1 &&
                selectedOptions.get(0).getText().equals("Books"));

        catDropDownSelect.selectByValue("4");

        selectedOptions = catDropDownSelect.getAllSelectedOptions();
        Assert.assertTrue(selectedOptions.size() == 1 &&
                selectedOptions.get(0).getText().equals("Baby"));


        //dropdown.getFirstSelectedOption().getText().equals("hello");

        // Practice multiple select:
        WebElement selectElement = driver.findElement(By.id(""));
        Select dropdown = new Select(selectElement);

        //verify is it a multiple select
        Assert.assertTrue(dropdown.isMultiple()); //true or false

        //what options are selected
        List<WebElement> selectedOptions2 = dropdown.getAllSelectedOptions();

        //print currently selected options
        for (WebElement selected : selectedOptions2){
            System.out.println(selected.getText());
        }
        //I want to select Java, Python

        //first I deselect HTML and CSS
        dropdown.deselectAll();
        //dropdown.deselectByVisibleText("HTML");

        //now select Java
        dropdown.selectByIndex(5);
        //now select Python
        dropdown.selectByValue("Python");

        //print new selected options
        for (WebElement selected : selectedOptions2){
            System.out.println(selected.getText());
        }

        selectedOptions2 = dropdown.getAllSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 2);







    }


}
