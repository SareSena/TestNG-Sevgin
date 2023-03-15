package renastech.day8_properties_JSexec;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;

import java.sql.Driver;

public class c4_AlertPractice extends TestBase2 {
    /*
    Go to "https://the-internet.herokuapp.com/"
    click Javascript Alerts
    click for Js Prompt
    Enter "hello world" text
    Click okay
    Validate your text appearing on the page
     */
    @Test
    public void TC1_AlertPractice(){
        DriverUtil.getDriver().get("https://the-internet.herokuapp.com/");
        DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']")).click();
        DriverUtil.getDriver().findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        Alert alert=DriverUtil.getDriver().switchTo().alert();
        String word="Hello World";
        alert.sendKeys("World");
        alert.accept();

        WebElement actualText=DriverUtil.getDriver().findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(actualText.getText().contains("World"));
    }
}
