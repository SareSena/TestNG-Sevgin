package renastech.day6_WebTable_Allerts_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import renastech.utilities.SmartBearutils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c5_smartBearNegativeTest {
    //1-Open a chrome browser
    //2-go to :http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3-enter incorrect username
    //4-enter wrong password
    //5-click login button
    //6-verify error message displayed: Invalid Login or Password
    //Note: create another utils method under SmartBearUtil class called negativeLoginFor SmartBear
    //this method should cover step 3,4,5

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1-Open a chrome browser
        //2-Go to :http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

        driver= WebDriverUtil.getDriver("Chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test(dataProvider = "testData")
    public void TC1_NegativeTest(String userName,String password){
        //3-enter incorrect username
        //4-enter wrong password
        //5-click login button
        SmartBearutils.negativeLoginSmartBear(driver,userName,password);
        //6-verify error message displayed: Invalid Login or Password
        WebElement errorMessage = driver.findElement(By.className("error"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
    @DataProvider(name="testData")
    public static Object[][] wrongUserCredentials(){

        return new Object[][]{
                {"sena","sena123"},
                {"uras","uras456"},
                {"","78910"},
                {"sarp","uras"},
                {"dgd@@@@","234-%^"},
                {"Tester","test"}};
        }
    }

