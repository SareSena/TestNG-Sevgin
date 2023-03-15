package renastech.utilities;

public class BrowserUtils {
    // create an utility method called wait
    // static method so i can call by using class name(no need to create an object for this one)
    //return type void
    //parameter should be int second
    //goal of method:
    //handle thread.sleep with try catch multiple with second parameter

    public static void wait(int second) {
        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
