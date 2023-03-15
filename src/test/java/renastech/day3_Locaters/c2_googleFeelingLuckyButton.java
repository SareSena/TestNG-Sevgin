package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import renastech.utilities.WebDriverUtil;

public class c2_googleFeelingLuckyButton {
    public static void main(String[] args) throws InterruptedException {
        //TASK: Google Feeling Lucky Button
        //1-Open a chrome browser
        //2-Go to: https://google.com
        //3-Write "apple' in searchbox
        //click i am feeling lucky button
        //verify title is Apple


        //1-Open a chrome browser
        WebDriver driver = WebDriverUtil.getDriver("chrome");

        //2-Go to: https://google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();

        //3-Write "apple' in searchbox
        //driver.findElement(By.name("q")).sendKeys("Apple");
       // driver.findElement(By.className("gLFyf gsfi")).sendKeys("Apple");
        //having spaces in classname will make your code fail
        //you can remove one part see if it is unique you can locate
        driver.findElement(By.className("gLFyf")).sendKeys("Apple");
        Thread.sleep(2000);

        //click i am feeling lucky button
        driver.findElement(By.className("RNmpXc")).click();

        //verify title is Apple
        String actualTitle = driver.getTitle();
        String expectedTitle = "Apple";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Lucky button passed!");
        }else{
            System.out.println("Lucky button failed!!!");
            System.out.println("actualTitle = " + actualTitle);
        }
        driver.close();



    }
}
