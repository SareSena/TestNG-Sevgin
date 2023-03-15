package renastech.day9_Actions_POM;

import org.testng.annotations.Test;
import renastech.Pages.SmartBearLoginPage;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class c4_smartBearPOMExample {

    //to be able to work with the page you need to create an instance from page
    //so you can have access to methods and webElements
    SmartBearLoginPage smartBearLoginPage;

    @Test
    public void TC1_smartBearPositiveLoginVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));

        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_userName"),
        PropertiesReadingUtil.getProperties("SmartBear_password"));

    }




}
