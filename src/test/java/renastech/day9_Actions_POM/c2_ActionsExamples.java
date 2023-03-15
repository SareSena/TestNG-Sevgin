package renastech.day9_Actions_POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;
import renastech.utilities.WebDriverUtil;

public class c2_ActionsExamples extends TestBase2 {
    //got to http://demo.guru99.com/test/simple_context_menu.html
    //double click to double click button
    //then accept the alert that pops up

    Actions actions; //instead of creating this object for each test we are specifiying at the top
    //then call in the each test

    @Test
    public void TC1_doubleClick(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");

        //button[.='Double-Click Me To See Alert']
        WebElement doubleclickButton = DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions = new Actions(DriverUtil.getDriver());
        actions.doubleClick(doubleclickButton).perform();

        Alert alert=DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.wait(3);
        alert.accept();
    }

    //go to  http://demo.guru99.com/test/simple_context_menu.html
    //right click to right click button
    //then click on edit button
    //then accept the alert that pops up

    @Test
    public void TC2_rightClick(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightclickButton = DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));

        actions=new Actions(DriverUtil.getDriver());
        //right click to right click button

        actions.contextClick(rightclickButton).perform();
        //then click on edit button
        BrowserUtils.wait(2);

        WebElement editButton = DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']"));
        editButton.click();
        //then accept the alert that pops up
        BrowserUtils.wait(1);
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        alert.accept();

    }

    //go to http://demo.guru99.com/test/drag_drop.html
    //drag bank word to account section and drop it
    //then drag 5000 to amount section and drop it

    @Test
    public void TC3_dragDropExample(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");

        //drag bank word to account section and drop it
          //2 things needs to be done here
          //first specify location of drag
          //second specify location of drop
        WebElement dragFrom= DriverUtil.getDriver().findElement(By.xpath("//a[.=' BANK ']"));
        WebElement dropTo=DriverUtil.getDriver().findElement(By.xpath("//ol[@id='bank']/li"));

        actions=new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragFrom,dropTo).perform();

        //then drag 5000 to amount section and drop it
        WebElement dragFrom2=DriverUtil.getDriver().findElement(By.id("fourth"));
        WebElement dropTo2=DriverUtil.getDriver().findElement(By.xpath("//ol[@id='amt7']//li"));

        actions.dragAndDrop(dragFrom2,dropTo2).perform();
    }

}
