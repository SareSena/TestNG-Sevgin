package renastech.day4_radio_checkbox_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c3_radioButtons {
    public static void main(String[] args) {
        /*
        Navigate to https://courses.letskodeit.com/practice
        click on BMW Radio Button
        verify that its selected
        Check BMW , Benx , Honda
        validate that benz i
         */

        WebDriver driver =WebDriverUtil.getDriver("chrome");
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement bmwRadioButton =driver.findElement(By.xpath("//input[@id='bmwradio']"));
        bmwRadioButton.click();
        boolean bmwRadioSelected = bmwRadioButton.isSelected();
        if (bmwRadioSelected){
            System.out.println("BMW is selected");
        }else{
            System.out.println("BMW is not selected.Test failed!!!");
        }
        WebElement hondaradioButton = driver.findElement(By.xpath("//input[@id='hondacheck']"));
        if (!hondaradioButton.isSelected()){
            System.out.println("honda button is not selected test passed!!!");
        }else{
            System.out.println("honda button is not selected test failed!!!");
        }
        driver.close();
    }

}
