package renastech.day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_AmazonIdLoc {

    public static void main(String[] args) {
        //1.open chrome browser
        //2.go to https://www.amazon.com
        //3.type laptop on search box then
        //4.click on search button
        //5.verify title

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//optional

        //2.go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        String searchData = "laptop";

        //3.type laptop on search box then
        //id is always unique
        //but we need make sure if id is static (not dynamic)
        //dynamic (when you refresh if you see id value is changing that means id is dynamic)
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchData);
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);

        //4.click on search button
        driver.findElement(By.id("nav-search-submit-button")).click();

        //5.verify title
        String containsTitle =searchData;
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(containsTitle)){
            System.out.println("amazon search passed!!!");
        }else{
            System.out.println("amazon search failed!!!");
            System.out.println("actualTitle = " + actualTitle);
        }
        driver.close();



    }
}
