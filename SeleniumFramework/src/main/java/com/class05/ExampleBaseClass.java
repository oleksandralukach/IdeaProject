package com.class05;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public abstract class ExampleBaseClass {

    public static String switchToNewWindow(WebDriver driver) {
        String currentWindowId = driver.getWindowHandle();
        Set<String> listOfWindows = driver.getWindowHandles(); //set of windows, no duplicates;

        for (String newWindow : listOfWindows) {
            if (!newWindow.equals(currentWindowId)) {
                driver.switchTo().window(newWindow);
            }
        }
        return currentWindowId;
    }
}
