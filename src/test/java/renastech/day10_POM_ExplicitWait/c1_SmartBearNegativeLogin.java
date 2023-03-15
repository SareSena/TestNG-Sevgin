package renastech.day10_POM_ExplicitWait;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.Pages.SmartBearLoginPage;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

import static org.testng.Assert.assertEquals;

public class c1_SmartBearNegativeLogin extends TestBase2 {
    SmartBearLoginPage smartBearLoginPage;//null object


    //enter wrong user name
    //enter wrong password
    //verify text is present Invalid Login or Password

    @Test
    public void TC1_SBNegativeTest(){
        smartBearLoginPage=new SmartBearLoginPage();
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
       smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_invalid_userName"),
               PropertiesReadingUtil.getProperties("SmartBear_invalid_password"));
       String expectedMessage="Invalid Login or Password";
    //   WebElement statusElement = smartBearLoginPage.getStatusMessageElement();
    //   String actualText=statusElement.getText();
      String actualText2=smartBearLoginPage.getStatusMessage();
        Assert.assertEquals(expectedMessage,actualText2,"negative login failed!!!");
    }

    //we extend TestBase2 with logic if inheritance
       //we get before and after method
    //we create page class
       //and we stored webelements and some useful methods
    //create an object from page to be able to call webelements and methods
    //you navigate your url
    //then you pass username password and click on login button with one method that  we created under smartbearlogin page
    //then we verify text after we try to logged in with a method that again we create under smartbearlogin page





}
