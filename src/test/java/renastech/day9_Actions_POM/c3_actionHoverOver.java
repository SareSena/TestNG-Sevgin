package renastech.day9_Actions_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;

public class c3_actionHoverOver extends TestBase2 {
    //go to "http://the-internet.herokuapp.com/hovers"
    //move mouse to third image
    //verify text of image present on the screen

    @Test
    public void TC1_HoverOver(){
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/hovers");
        //h5[.='name: user3']/../../img
        //h5[.='name: user3']/../preceding-sibling::img
        //  /preceding-sibling will go previous sibling
        //  /fallowing-sibling will go next sibling
        WebElement thirdimage = DriverUtil.getDriver().findElement(By.xpath(" //h5[.='name: user3']/../../img"));

        Actions actions=new Actions(DriverUtil.getDriver());

        actions.moveToElement(thirdimage).perform();

        WebElement ImageText = DriverUtil.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        boolean testisPresent = ImageText.isDisplayed();
        Assert.assertTrue(testisPresent,"text is not present");
    }

}
