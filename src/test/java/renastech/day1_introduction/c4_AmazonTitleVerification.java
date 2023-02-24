package renastech.day1_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_AmazonTitleVerification {

    public static void main(String[] args) throws InterruptedException {
        // Task -2
        //Open Chrome Browser
        //Go to Google
        //Navigate back
        //Navigate forward
        //Navigate to https://www.amazon.com
        //Verify title contains: Smile


      //open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver drvr = new ChromeDriver();
        drvr.manage().window().maximize();
        //Go to Google
       drvr.get("https://www.google.com/");// this line takes us to google


        //Navigate back
        drvr.navigate().back();// this line will take us back to empty page
        //Navigate forward
        drvr.navigate().forward();//this line will take us forward to google

        Thread.sleep(3000);
        //Navigate to https://www.amazon.com
        drvr.navigate().to(" https://www.amazon.com");

        //Verify title contains: Smile
        String containsTitle = "Smile";
        String actualTitle = drvr.getTitle();

        if (actualTitle.contains(containsTitle)){
            System.out.println("Amazon title passed!!");
        }else{
            System.out.println("Amazon title failed!!");
        }



    }
}
