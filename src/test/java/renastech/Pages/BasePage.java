package renastech.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import renastech.utilities.DriverUtil;

import java.time.Duration;

public class BasePage {

    protected WebDriverWait webDriverWait=new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(15));
    /*
    IN POM Design you need to have some structure for each page:
1.PageFactory.initElements(driver, this);
   --> it creates connection between driver and object of class
2.@FindBy annotation to locate WebElements.
   --> Using this FindBy annotation, help us to locate web elements.
3.Create methods related webElements

     */
    // 1.PageFactory.initElements(driver, this);
    //  --> it creates connection between driver and object of class
    public BasePage(){

        PageFactory.initElements(DriverUtil.getDriver(),this);
    }

}
