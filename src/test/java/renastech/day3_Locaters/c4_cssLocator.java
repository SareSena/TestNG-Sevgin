package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

public class c4_cssLocator {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https:/www.amazon.com");


        //  1.tagname[attribute='value']
       // driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("tv");
       // driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("tv");

        //   2.tagname.value-->. means in css locator className

      //    3.tagname#value #means id in css
      //  driver.findElement(By.id("twotabsearchtextbox"));
     //   driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
      // input#twotabsearchtextbox
        driver.findElement(By.cssSelector(" input#twotabsearchtextbox")).sendKeys("tv");
        driver.close();

    }
}
