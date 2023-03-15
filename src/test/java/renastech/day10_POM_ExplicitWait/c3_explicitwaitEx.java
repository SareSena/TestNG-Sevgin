package renastech.day10_POM_ExplicitWait;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.Pages.SeleniumPracticeExplicitWaitPage;
import renastech.base.TestBase2;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class c3_explicitwaitEx extends TestBase2 {
    //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    //click on timer
    //verify webdriver text gets present
    SeleniumPracticeExplicitWaitPage seleniumPracticeExplicitWaitPage;//null
       @Test
       public void TC1(){
           seleniumPracticeExplicitWaitPage=new SeleniumPracticeExplicitWaitPage();
           DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("selenium_practice_url"));
         //  seleniumPracticeExplicitWaitPage.timerButton.click();
           seleniumPracticeExplicitWaitPage.getDefaultText();
           seleniumPracticeExplicitWaitPage.clickTimerButton();
           seleniumPracticeExplicitWaitPage.getDefaultText();
         //  BrowserUtils.wait(6);
           WebElement actualText= seleniumPracticeExplicitWaitPage.getWebDriverText();
           seleniumPracticeExplicitWaitPage.getDefaultText();

           Assert.assertEquals(actualText.getText(),"WebDriver","WebDriver text is not present on the page");
       }

    //we extend TestBase2 with logic if inheritance
    //we get before and after method
    //we create page class SeleniumPracticeExplicitWaitPage
    //and we stored webelements that we need to be able to do testing  and some useful methods
    //create an object from page to be able to call webelements and methods
    //you navigate your url with using properties file and properties util
    //then you pass username password and click on login button with one method that  we created under smartbearlogin page
    //then you click on time
    //then you waited until webdriver text to be present
    //then verify your text was present



}
