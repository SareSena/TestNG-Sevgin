package renastech.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import renastech.utilities.BrowserUtils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
@AfterMethod
    public void closing(){
    BrowserUtils.wait(3);
     //   driver.quit();//this will close all the tabs
        driver.close();//will close only current tab

}
}
