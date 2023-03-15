package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

public class c5_AbsulateXpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://renas-practice.herokuapp.com/home");
        WebElement header = driver.findElement(By.xpath("/html/body/app-root/div/div/app-home/h1[1]"));

        //isdisplayed==it will check if webElement is present on the page
        //validate if selenium header is present in renastech page
        if (header.isDisplayed()){
            System.out.println("Selenium header is present");
        }else{
            System.out.println("Selenium header is not present");
            System.out.println("header = " + header);
        }
    }
}
