package renastech.day11_xmlFiles;

import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;

public class c1_googletest extends TestBase2 {
    @Test
    public void test(){
        DriverUtil.getDriver().get("https://www.google.com");
    }


}
