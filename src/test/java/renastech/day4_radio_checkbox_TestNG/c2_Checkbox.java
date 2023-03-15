package renastech.day4_radio_checkbox_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class c2_Checkbox {
    public static void main(String[] args) {
        //1.Open chrome broser
        //2.Go to https://demo.guru99.com/test/radio.html
        //3.Verify checkbox1 is not selected
        //4.Click to checkbox2
        //5.Verify checkbox2 is selected.

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       // driver.findElement(By.id("vfb-6-0"));//best option
        WebElement checkBox1 =driver.findElement(By.xpath("//input[@value='checkbox1']"));
      //  driver.findElement(By.xpath("//input[@id='vfb-6-0']"));

        //3.Verify checkbox1 is not selected
        if (!checkBox1.isSelected()){
            System.out.println("Default verification for checkBox1 passed");
        }else{
            System.out.println("Default verification for checkBox1 failed!!");
        }
        //4.Click to checkbox2
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
        checkBox2.click();
        //5.Verify checkbox2 is selected.
        if (checkBox2.isSelected()){
            System.out.println("Verification for checkBox2 after click passed!!");
        }else{
            System.out.println("Verification for checkBox2 after click failed!!!");
        }
        driver.close();

    }
}
