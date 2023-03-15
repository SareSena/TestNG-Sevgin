package renastech.day5_TestNG_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.BrowserUtils;
import renastech.utilities.SmartBearutils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c4_SmartBearLoginPage {
    //1-Open a chrome browser
    //2-Go to : http:/secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Enter username ---> Tester
    //4-Enter password -->test
    //5-Click "Login" button
    //6-Verify title equals: Web Orders

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //1-Open a chrome browser
        //2-Go to : http:/secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http:/secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @AfterMethod
    public void closing() throws InterruptedException {
       // Thread.sleep(2000);
        BrowserUtils.wait(2);
        //driver.close();

    }
    @Test
    public void TC1_LoginVerification(){
        //3- Enter username ---> Tester
       WebElement username = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
       username.sendKeys("Tester");
        //4-Enter password -->test
        WebElement password= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
       // WebElement password = driver.findElement(By.id("ctl00_MainContent_username"));
        password.sendKeys("test");
        //5-Click "Login" button
        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();
        //6-Verify title equals: Web Orders
       String expected = "Web Orders";
       String actual =driver.getTitle();
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void TC2_LoginVerification(){
        SmartBearutils.loginForSmartBear(driver);
        //6-Verify title equals: Web Orders
        Assert.assertTrue(driver.getTitle().equals("Web Orders"),"Login Failed");
    }


}
