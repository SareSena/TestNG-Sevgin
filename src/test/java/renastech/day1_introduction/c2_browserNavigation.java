package renastech.day1_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_browserNavigation {
    public static void main(String[] args) throws InterruptedException {

      //create the connection between chrome and selenium
        WebDriverManager.chromedriver().setup();

        //create an instance of chrome driver
        WebDriver chromeDriver = new ChromeDriver();

        //maximize the page
        chromeDriver.manage().window().maximize();

        chromeDriver.get("https://www.amazon.com");

        Thread.sleep(2000);
        chromeDriver.navigate().back();
        Thread.sleep(2000);
        chromeDriver.navigate().forward();

        System.out.println("chromeDriver.getTitle() = " + chromeDriver.getTitle());

        chromeDriver.navigate().to("https://www.facebook.com");

        Thread.sleep(2000);
        System.out.println("chromeDriver.getTitle() = " + chromeDriver.getTitle());

        chromeDriver.close();

    }
}
//    //TASK
//      //1. Open Chrome Browser
        //2.Go to google
        //3.Verify title: Expected : Google

