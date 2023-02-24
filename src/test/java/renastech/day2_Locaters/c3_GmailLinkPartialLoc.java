package renastech.day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_GmailLinkPartialLoc {
    public static void main(String[] args) {
        //    //1-open a chrome browser and go to google
        //   //2-click to Gmail link from top right
        //   //3-Verify title contains Gmail , expected:"Gmail"

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");


        //   //2-click to Gmail link from top right
       // driver.findElement(By.linkText("Gmail")).click();//check for exact match
        driver.findElement(By.partialLinkText("Gma")).click();
        //   //3-Verify title contains Gmail , expected:"Gmail"
        String containsTitle="Gmail";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(containsTitle)){
            System.out.println("Gmail passed!!!");
        }else {
            System.out.println("Gmail failed!!!");
            System.out.println("actualTitle = " + actualTitle);
        }
        driver.close();


    }
}
