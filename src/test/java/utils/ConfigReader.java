package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    public static String deviceName;
    public static String platformName;
    public static String app;

    // create an object of Properties class
    public static Properties properties = new Properties();

    public static void getProperties(){
        // use try-catch block to handle the exceptions
        try{
            // create an object of FileInputStream class and store the path of config.properties file
            FileInputStream inputStream = new FileInputStream("C:\\Users\\divjot.kaur\\IdeaProjects\\practicegradleandroid\\src\\test\\config.properties");

            // load the config.properties file
            properties.load(inputStream);

            // get the device name from config.properties file
            deviceName = properties.getProperty("deviceName");

            // get the platform name from config.properties file
            platformName = properties.getProperty("platformName");

            // get the path of apk file from config.properties file
            app = properties.getProperty("app");
        }
        // handles the exception using catch block
        catch(Exception e){

            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
}
