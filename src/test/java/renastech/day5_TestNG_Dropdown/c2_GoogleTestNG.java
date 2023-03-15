package renastech.day5_TestNG_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c2_GoogleTestNG {

    //1-Go to google
    //2-Verify title is google

    //1-Go to google
    //search laptop
    //make sure title contains laptop

    //common steps:
    //set up driver and go to google

    WebDriver driver; //null driver

    @BeforeMethod
    public void setup(){
        //this annotation will apply all of your tests
        //so it is better to use common steps in here so you dont duplicate steps
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    @Test(priority = 1)
    public void TC1_googleVerifyTitle() throws InterruptedException {
        System.out.println("TC1 is running");
        //1-Go to google this is done in the before method
        //2-Verify title is google
        String expectedTitle = "google";
        String actualTitle =driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle,"Title Verification Failed!!!");

    }

    @Test(priority = 2)
    public void TC2_googleVerifySearchBox(){
        //1-Go to google  this is done in before
        System.out.println("TC2 is running");
        //search laptop
        WebElement searchBox = driver.findElement(By.name("q"));
        //make sure title contains laptop
        searchBox.sendKeys("laptop", Keys.ENTER);
        String actualTitle = driver.getTitle();//laptop-Google search
        String expectedTitle="laptop";

       boolean b =actualTitle.contains(expectedTitle);
        Assert.assertTrue(b,"search function passed!!!");

    }
    @AfterMethod
    public void closing(){
        driver.close();
    }
}
