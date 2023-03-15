package renastech.day9_Actions_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;

public class c1_dropdown extends TestBase2 {

    @Test
    public void TC1_test(){
        DriverUtil.getDriver().get("https://exchange.sandbox.gemini.com/register/institution");//su an guncel bir site degil
        //company location option direk input olarak da yazabiliyorsun.
        WebElement dropdownBox = DriverUtil.getDriver().findElement(By.id("countryDropdown"));
        dropdownBox.sendKeys("Cuba");
        dropdownBox.sendKeys(Keys.ARROW_DOWN);
        dropdownBox.sendKeys(Keys.ENTER);
    }
}
