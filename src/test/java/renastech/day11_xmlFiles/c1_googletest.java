package renastech.day11_xmlFiles;

import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;

public class c1_googletest extends TestBase2 {

    //verify title is changed after click gmail button

    @Test
    public void test(){
        DriverUtil.getDriver().get("https://www.google.com");

    }
    //we extend TestBase2 with logic if inheritance
    //we get before and after method
    //we create page class googlemainpage
    //and we stored webelements : such as gmail button that we need to be able to do testing
    // and some useful methods:getTitle , clickGmailButton
    //create an object from page to be able to call webelements and methods

    //test class
    //you navigate your url with using properties file and properties util
    //then you pass username password and click on login button with one method that  we created under smartbearlogin page
    //then you click on gmail button
    //then you get title
    //then verify title changed with assert




}
