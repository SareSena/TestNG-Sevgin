package renastech.day6_WebTable_Allerts_Iframe;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.BrowserUtils;
import renastech.utilities.SmartBearutils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c1_SmartBearTest {

     //1-Open a chrome browser
    //2-Go to : http:/secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3-Login
    //4-click on order
    //5-Select familyAlbum from product, set quantity to 5
    //6-Click to "Calculate" button
    //7-Fill address Info with JavaFaker
    //8-Click on "visa" radio button
    //9-Generate card number using javaFaker
    //10-Enter expiration date
    //11-Click on "Process"
    //12-Verify success message "New order has been successfully added."is displayed.

    WebDriver driver;
 @BeforeMethod
    public void setup(){
     //1-Open a chrome browser
     //2-Go to : http:/secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
     driver= WebDriverUtil.getDriver("Chrome");
     driver.get("http:/secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     //3-Login
     SmartBearutils.loginForSmartBear(driver);

  }

  @Test
    public void TC1(){


    //4-click on order
    //a[@href='Process.appx']
    //a[.='Order']
    //linktext
    WebElement orderLink=driver.findElement(By.xpath("  //a[.='Order']"));
    orderLink.click();
    //5-Select familyAlbum from product, set quantity to 5
      //first locate dropdown then we will choose the option
      Select dropdownProduct=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
      dropdownProduct.selectByVisibleText("FamilyAlbum");

      WebElement quantity = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
      quantity.sendKeys(Keys.BACK_SPACE);
      //quantity.clear();

      quantity.sendKeys("5");
      //quantity.clear();
    //6-Click to "Calculate" button
    //  driver.findElement(By.xpath("//input[@type='submit']")).click();
      driver.findElement(By.xpath("//input[@value='Calculate']")).click();
    //7-Fill address Info with JavaFaker
      Faker faker= new Faker();
      WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
      WebElement streetName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
      WebElement cityName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
      WebElement stateName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
      WebElement zipName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

   customerName.sendKeys(faker.name().fullName());
   streetName.sendKeys(faker.address().streetAddress());
   cityName.sendKeys(faker.address().cityName());
   stateName.sendKeys(faker.address().state());
   zipName.sendKeys(faker.address().zipCode());

      //8-Click on "visa" radio button
      driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();//input[@value='Visa']

    //9-Generate card number using javaFaker
      WebElement cardNumber=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
      cardNumber.sendKeys(faker.number().digits(9));
     // cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));
      //6771-8991-1109-4503
    //10-Enter expiration date
      WebElement expDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
      expDate.sendKeys("05/27");

    //11-Click on "Process"
      WebElement processButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
      processButton.click();
    //12-Verify success message "New order has been successfully added."is displayed.
      WebElement successMessage= driver.findElement(By.xpath("//strong"));
      Assert.assertEquals(successMessage.getText(),"New order has been successfully added.");

  }
}
