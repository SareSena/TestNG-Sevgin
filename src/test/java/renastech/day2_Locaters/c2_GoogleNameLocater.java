package renastech.day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.SocketException;

public class c2_GoogleNameLocater {
    //TASK: Google Search
    //1-Open a chrome browser
    //2-go to : https://google.com
    //3-Write "orange" in search box
    //4-Click google search button
    //5-Verify title:
    //Expected: Title should start with "orange" word
    //6-navigate back
    //7-write banana in search box
    //8-verify title contains banana.

//    1-Name:
//    This locator will be looking into the whole HTML code and return the webElement
//with matching name attribute
//--this one fill find and return the first webElement it finds.
//
//            syntax: driver.findElement(By.name("name attribute value")).


    public static void main(String[] args) throws InterruptedException {



        //got to google
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2-go to : https://google.com
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        //3-Write "orange" in search box
        //driver.findElement(By.name("q")).sendKeys("orange");
        //WebElement searchbox = driver.findElement(By.name("Qasrdasd"));//no such element exception
        WebElement searchBox = driver.findElement(By.name("q"));
        //findElement will return you webElement
        searchBox.sendKeys("orange");

        Thread.sleep(2000);
        //4-Click google search button
        WebElement googleSearchButton=driver.findElement(By.name("btnK"));
        googleSearchButton.click();

        //5-Verify title:
        //Expected: Title should start with "orange" word
        String expectedTitle="orange";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Passed for Orange!");
        }else{
            System.out.println("Failed for Orange!!!");
            System.out.println("actualTitle="+actualTitle);
        }
       Thread.sleep(2000);
//        driver.close();

        //6-navigate back
        driver.navigate().back();

        Thread.sleep(2000);
        //7-write banana in search box
        driver.findElement(By.name("q")).sendKeys("banana"+Keys.ENTER);
        //8-verify title contains banana.

        String expectedTitle2="banana";
        String actualTitle2 = driver.getTitle();

        if(actualTitle2.startsWith(expectedTitle2)){
            System.out.println("Passed for Banana!");
        }else{
            System.out.println("Failed for Banana!!!");
            System.out.println("actualTitle2 = " + actualTitle2);
        }
        Thread.sleep(2000);
        driver.close();

    }

}
