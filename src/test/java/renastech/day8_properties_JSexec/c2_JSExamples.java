package renastech.day8_properties_JSexec;

import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.collections.Sets;
import renastech.base.TestBase;

import java.util.Set;

public class c2_JSExamples extends TestBase {
    @Test
    public void TC1_handlingWindowWithJSExecutor(){
    driver.get("https://www.youtube.com");

        //    1-We create javaScriptExecuter object and we cast our WebDriver type instance into JavascriptExecutor type
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com' , '_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com' , '_blank');");

       // 2-Then we access to the methods that are coming from JavascriptExecutor interface.
        //  js.executeScript(Script,Arguments);
        Set<String> windows= driver.getWindowHandles();
        for (String window:windows){
            driver.switchTo().window(window);
            String currentWindow= driver.getWindowHandle();
            System.out.println("currentWindow = " + currentWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
    }
    @Test
    public void TC2_scrollDownWithJSExecutor(){
       JavascriptExecutor js=(JavascriptExecutor) driver;
       driver.get("http://demo.guru99.com/test/guru99home/");
       js.executeScript("window.scrollBy(0,1000)");
       /*
       The syntax of ScrollBy() method is:

       executeScript ("window.scrollBy(x-pixels, y-pixels)");
       x-pixels is the number at x-axis,
       it moves to the left if number is positive and
       it moves to the right if number is negative.
       y-pixels is the number at y-axis,
       it moves to the down if number is positive and
       it moves to the up if number is in negative.

        */


    }


}
