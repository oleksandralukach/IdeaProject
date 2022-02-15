package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountPage {

    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //style to find locators
    @FindBy(xpath = "//*[@class=\"page-heading\"]\n")
    public WebElement titleMyAccount;

    @FindBy(xpath = "//*[@class='icon-chevron-left']\n")
    public WebElement buttonHomeMyAccount;
}
