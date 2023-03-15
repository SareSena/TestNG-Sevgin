package renastech.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearutils {

    //method goal is to create a util that will do login function for smartbear

    public static void loginForSmartBear(WebDriver driver){
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

    }
    //3-enter incorrect username
    //4-enter wrong password
    //5-click login button

    //Note: create another utils method under SmartBearUtil class called negativeLoginFor SmartBear
    //this method should cover step 3,4,5
    public static void negativeLoginSmartBear(WebDriver driver,String userID,String passwordID){
        //3- Enter username ---> incorrect username
        WebElement username = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        username.sendKeys(userID);
        //4-Enter password -->incorrect password
        WebElement password= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        // WebElement password = driver.findElement(By.id("ctl00_MainContent_username"));
        password.sendKeys(passwordID);
        //5-Click "Login" button
        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();
    }
    public static void verifyStreet(WebDriver driver,String streetName){
        //to locate all table ctl00_MainContent_orderGrid
        //table[@id='ctl00_MainContent_orderGrid'] to locate all table
        //table[@id='ctl00_MainContent_orderGrid']//tr to locate all 9 rows
        //table[@id='ctl00_MainContent_orderGrid']//tr[3]--this will locate 3. row from table --1row
        //table[@id='ctl00_MainContent_orderGrid']//tr//td[6]
        //--this will locate each 6.td from each row so that is technically column 6
        //table[@id='ctl00_MainContent_orderGrid']//tr[2]//td[2] from second row second data only one data

        List<WebElement> streetList=driver.findElements(By.xpath("  //table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));
        //this xpath will store all the street names from table

        for (WebElement eachStreet:streetList){
            if (eachStreet.getText().equals(streetName)){
                Assert.assertTrue(eachStreet.getText().equals(streetName));
                return;
            }
        }
        Assert.fail("Street name : " +streetName + " is not present on the table");
    }

}
