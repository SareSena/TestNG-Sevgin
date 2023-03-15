package renastech.day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.List;

public class c7_AppleFindElements {
    public static void main(String[] args) {
        //1-Open chrome browser
        //2-Go to https://www.apple.com
        //3-Click to iPhone
        //4-Print out the texts of all links

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();

        //3-Click to iPhone
       // driver.findElement(By.xpath("//a[@aria-label='iPhone']")).click();

       //xpath has ability to go also from child to parent
       //to child to parent use /..
        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();

        //4-Print out the texts of all links
        //print out all links
        //count of links that doesnt have text
        //count of links that has text
        // a tag has all the links
        List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));

        int linkWithText = 0;//to count elements that has text
        int linkWithoutText=0;//to count elements that doesnt have text

        for (WebElement eachLink: allLinks){
            String elementsToText = eachLink.getText(); //"" "Airtag"
            System.out.println(elementsToText);

            if (elementsToText.isEmpty()){
                linkWithoutText++;

            }else{
                linkWithText++;
            }
        }
        System.out.println("linkWithText = " + linkWithText);
        System.out.println("linkWithoutText = " + linkWithoutText);
        System.out.println("allLinks.size()= " + allLinks.size());


    }
}
