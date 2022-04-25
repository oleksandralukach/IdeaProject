package com.practice.sofia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesPractice {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test1() throws InterruptedException {
        //we will treat as a static table
        //we will hardcode the row where Dan Brown is displayed
        driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");

        //bring the table to the viewport
        Actions actions = new Actions(driver);
        WebElement buttonToScrollTo = driver.findElement(By.id("win1"));
        actions.moveToElement(buttonToScrollTo).perform();
        Thread.sleep(3000);

        WebElement table = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']"));

        //how to get the number of rows
        List<WebElement> rows = table.findElements(By.xpath(".//tr"));
        int numberRows = rows.size();
        System.out.println("Number of rows: " + numberRows);

        //how to get the number of columns
        List<WebElement> columns = table.findElements(By.xpath(".//tr/th"));
        int numberColumns = columns.size();
        System.out.println("Number of columns: " + numberColumns);

        //print all the books of Den Braun
        List<WebElement> denBraunRow = table.findElements(By.xpath(".//tr[4]//td"));
        for (int i = 1; i < denBraunRow.size(); i++) {
            System.out.println(denBraunRow.get(i).getText());
        }
    }

    @Test
    public void test2() throws InterruptedException {
        //we will treat as a dynamic table
        //we need to find out which columns contain author
        //we need to locate the row which contains books of author
        driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");

        //bring the table to the viewport
        Actions actions = new Actions(driver);
        WebElement buttonToScrollTo = driver.findElement(By.id("win1"));
        actions.moveToElement(buttonToScrollTo).perform();
        Thread.sleep(3000);
        WebElement table = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']"));

        //find all heading of columns
        List<WebElement> columnNames = table.findElements(By.xpath(".//th")); //Book1, Book2, Author
        //find number of Author column (1)
        int indexOfAuthorColumn = 0;
        for (WebElement columnName : columnNames) {
            ++indexOfAuthorColumn;
            if (columnName.getText().contains("Author")) break;
        }

        // find list of authors inside Author column[1]
        List<WebElement> authors = table.findElements(By.xpath(".//tr//td["
                + indexOfAuthorColumn + "]")); //no first heading row/ no//td in there, only //th

        // find Dan Braun row(4)
        int indexOfDanBraunRow = 1; //here we start with 1 heading row and incrementing it right away to next row
        for(WebElement authorName : authors){
            ++indexOfDanBraunRow;
            if (authorName.getText().contains("Dan Brown")) break;
        }

        //print all the books of Dan Braun (row, but skip author name column
        String booksXpath = ".//tr["+indexOfDanBraunRow+"]//td";
        int numOfColumns = columnNames.size();
        List<WebElement> bookS = table.findElements(By.xpath(booksXpath));

        for (int i = 1; i < numOfColumns; i++) {
            if (i == indexOfAuthorColumn-1) {
                continue;
            }
            System.out.println(bookS.get(i).getText());

//            for(int i = 1; i <=numOfColumns; i++){
//            if (i == indexOfAuthorColumn-1) continue;
//            WebElement book = table.findElement(By.xpath(booksXpath + "["+i+"]"));
//            System.out.println(book.getText());}
        }


    }
    @Test
    public void test3() throws InterruptedException {
        //print out authors names
        driver.navigate().to("https://chandanachaitanya.github.io/selenium-practice-site/");

        //bring the table to the viewport
        Actions actions = new Actions(driver);
        WebElement buttonToScrollTo = driver.findElement(By.id("win1"));
        actions.moveToElement(buttonToScrollTo).perform();
        Thread.sleep(3000);
        WebElement table = driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']"));

        List<WebElement> columnsNames = table.findElements(By.xpath(".//th"));

        int indexOfAuthorColumn = 0;
        for(WebElement name : columnsNames){
            ++indexOfAuthorColumn;
            if (name.getText().contains("Author")){
                break;
            }
        }
        List<WebElement> authorName = table.findElements(By.xpath(".//tr//td["
                + indexOfAuthorColumn + "]"));

        for (int i = 0; i < authorName.size(); i++) {
            System.out.println(authorName.get(i).getText());
        }
    }
    @Test
    public void test4() throws InterruptedException {
        driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        int countryColumn = 3;

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));

        int mexicoRow = 1; //pointing to heading row
        for(int i = 2; i < rows.size(); i++){//tr[1] doesn't have //td, so we start with 2
            ++mexicoRow;
            WebElement countryCell = driver.findElement(By.xpath("//table[@id='customers']//tr[" +
                    i + "]//td[3]"));
            if (countryCell.getText().equals("Mexico"))break;
        }

        int companyColumn = 1;
        WebElement mexicoCompany = driver.findElement(By.xpath("//table[@id='customers']//tr["+mexicoRow
        + "]//td["+companyColumn+ "]"));
        System.out.println(mexicoCompany.getText());

    }
}
