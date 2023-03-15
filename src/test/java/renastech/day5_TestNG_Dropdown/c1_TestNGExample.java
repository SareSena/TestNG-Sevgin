package renastech.day5_TestNG_Dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class c1_TestNGExample {


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
        @Test(priority=3,dependsOnMethods = "TC3_test")
        public void TC1_test(){
            System.out.println("Test1 is running");
        }

        @Test(priority=1)
        public void TC3_test(){
            System.out.println("Test3 is running");
            String actualword="hello";
            String expectedWord="hello2";
            Assert.assertEquals(actualword,expectedWord);
            System.out.println("continue test3");

        }
        @Test(priority=2)
        public void TC2_test(){
            System.out.println("Test2 is running");
            String str="renastech";
            String str2="renastech";
            Assert.assertTrue(str.equals(str2));
        }

        @Ignore //will ignore this test and not run
        @Test
        public void TC4_test(){
            System.out.println("Running test4");
        }
    }




