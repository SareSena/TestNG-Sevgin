package renastech.day7_Windows_Tabs_Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import renastech.base.TestBase;
import renastech.utilities.BrowserUtils;

import java.util.Set;

public class c2_Tabs extends TestBase {
    //inheritance example to extend my testbase class to all of my test

    @Test
    public void TC1_tabHandle(){
        driver.get("https://renas-practice.herokuapp.com/home");
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();

        String currentWindow = driver.getWindowHandle();//this will only store one window
        //and it will store current window that you have
        System.out.println("currentWindow = " + currentWindow);
        System.out.println("driver.getTitle() = " + driver.getTitle());

        WebElement openTabButton = driver.findElement(By.id("open-tab"));
        openTabButton.click();

        System.out.println(" after clicking tab button driver.getTitle() = " + driver.getTitle());
        //since we didnt change driver focus it will give us same one at the beginnig

        Set<String> allwindows = driver.getWindowHandles();//this will store all the tabs (windows)
        for (String tab: allwindows){
            driver.switchTo().window(tab);
            BrowserUtils.wait(2);
            System.out.println(driver.getTitle());
        }


    }


}
