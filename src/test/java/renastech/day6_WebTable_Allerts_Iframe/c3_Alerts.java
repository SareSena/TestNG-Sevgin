package renastech.day6_WebTable_Allerts_Iframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.BrowserUtils;
import renastech.utilities.SmartBearutils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c3_Alerts {
    //1-Open a chrome browser
    //2-Go to :https://renas-practice.herokuapp.com/home
    //locate the alert button to click it
    //click button
    //handle alert
WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1-Open a chrome browser
        //2-Go to :https://renas-practice.herokuapp.com/home

        driver= WebDriverUtil.getDriver("Chrome");
        driver.get("https://renas-practice.herokuapp.com/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void TC1_alertPractice(){
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("Alert BoxI")).click();
        //locate the alert button to click it
        WebElement alertButton = driver.findElement(By.id("confirm-demo"));
        //click button
        alertButton.click();
        //handle alert
        //since alert is JC alert you need to change your driver focus to alert
        Alert alert = driver.switchTo().alert();
        BrowserUtils.wait(2);
        alert.accept();//clicking ok
        BrowserUtils.wait(2);
        alertButton.click();
        alert.dismiss();//will click on cancel button

    }
}
