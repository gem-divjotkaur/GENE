package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;

public class Screenshots {

    // create an object of AndroidDriver

    public static void takeScreenShot(AndroidDriver driver,String screenshot){

        // use try-catch block to handle the exception
        try{
            // store screenshot as file
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            // store file as jpg format in the screenshots folder
            FileUtils.copyFile(file, new File("C:\\Users\\divjot.kaur\\IdeaProjects\\practicegradleandroid\\src\\test\\resources\\screenshots\\" + screenshot+".jpg"));
        }
        // handle the exception using catch block
        catch(Exception e){

            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
}
