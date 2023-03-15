package renastech.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLoginPage extends BasePage{

    //  2.@FindBy annotation to locate WebElements.
   //         --> Using this FindBy annotation, help us to locate web elements.
  //3.Create methods related webElements

    @FindBy(id="ctl00_MainContent_username")
    public WebElement usernameBox; //you assigned id locator to this webElement

    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id="ctl00_MainContent_status")
    private WebElement statusMessage;
    //if this is private you won't have access from outside
    //you will need to create methods to be able to use it

    // //3.Create methods related webElements
    public  void loginSmartBear(String username,String password){
        //either you can also assign your username and password from properties file
        //or just from calling method

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }

    public WebElement getStatusMessageElement(){
        return statusMessage;
    }


    public String getStatusMessage(){
        return  statusMessage.getText();
    }




}
