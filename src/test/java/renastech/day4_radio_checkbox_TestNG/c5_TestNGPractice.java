package renastech.day4_radio_checkbox_TestNG;

import org.testng.annotations.*;

public class c5_TestNGPractice {

    @BeforeClass
    public void setupClass(){//This one will only run once before everything in the class
        System.out.println("Before class is running");
    }
    @AfterClass
    public void setupAfterClass(){//this one will only run once after everything in the class
        System.out.println("AfterClass is running");
    }
    @BeforeMethod
    public void setup(){//this will run before each test annotation
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void closing(){//this will run after each annotations
        System.out.println("After method is running");
    }
    @Test
    public void TC1_test(){
        System.out.println("Test1 is running");
    }
    @Test
    public void TC3_test(){
        System.out.println("Test3 is running");
    }
    @Test
    public void TC2_test(){
        System.out.println("Test2 is running");
    }
}
