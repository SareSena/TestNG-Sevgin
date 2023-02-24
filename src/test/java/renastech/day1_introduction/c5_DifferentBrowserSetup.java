package renastech.day1_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class c5_DifferentBrowserSetup {

    public static void main(String[] args) {
        //before you run make sure you have the browser type in your computer
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

       WebDriverManager.chromedriver().setup();
       WebDriver driver1 = new ChromeDriver();

       WebDriverManager.firefoxdriver().setup();
       WebDriver driver2 = new FirefoxDriver();

       //since i dont have ie driver in my laptop it wont run
      //  WebDriverManager.iedriver().setup();
      //  WebDriver driver3 = new InternetExplorerDriver();

        driver.get("https://www.amazon.com");//it will take edge driver to amazon
        driver1.get("https: //www.google.com");//it will take firefox driver to google

    }
}
