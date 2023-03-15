package renastech.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverUtil {

    //to be able to achieve singleton design pattern we will need to have private constructor
    //no one can be able to create object from this class because we are making constructor private
    private DriverUtil(){

    }
    private static WebDriver driver; //we are using encapsulation logic in here by making driver private
    //we will need to create getter and setter for driver

    public static WebDriver getDriver(){
        if (driver==null){
            String browser=PropertiesReadingUtil.getProperties("browser");//chrome-headless
            switch (browser){
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(options);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "chrome-headless":
                    ChromeOptions options2 = new ChromeOptions();
                    options2.addArguments("--remote-allow-origins=*");
                    options2.setHeadless(true);
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(options2);
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;

            }
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver !=null){
            driver.quit();
            driver=null;
        }
    }
}
