package renastech.day2_Locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_FacebookTitleVerification {

  //TC #1: Facebook title verification
    //Task -
    //open chrome browser
    //go to https://www.facebook.com
    //Verify title: Expected: "Facebook - Log in or sign up"
    public static void main(String[] args) {
      //  //open Chrome browser
      //setup connection between selenium and browser
      WebDriverManager.chromedriver().setup();
      //create instance of driver
      WebDriver driver = new ChromeDriver();

      //go to https://www.facebook.com
      driver.get("https://www.facebook.com");

      String expectedTitle="Facebook - Log in or sign up";
      String actualTitle = driver.getTitle();

      if (actualTitle.equals(expectedTitle)) {
        System.out.println("Face Title Verification Passed");
      }else{
        System.out.println("Facebook Title Verification Failed!!!!!!!!!!!");
      }

      driver.close();

    }
}
