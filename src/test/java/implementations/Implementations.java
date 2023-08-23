package implementations;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import locators.Locators;
import logger.Loggers;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import utils.ConfigReader;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import logger.Loggers;
import utils.Screenshots;

public class Implementations {
    public static AndroidDriver driver;

    public static void getDesiredCapabilities(){

        // use try-catch box to handle the exception
        try{
            // get the getProperties() method of ConfigReader class
            ConfigReader.getProperties();

            // create an object of DesiredCapabilities class
            DesiredCapabilities dc = new DesiredCapabilities();

            // set the DesiredCapabilities like device name, platform name, apk path
            dc.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigReader.deviceName);
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.platformName);
            dc.setCapability(MobileCapabilityType.APP, ConfigReader.app);

            // create an object of URL class and pass the remote host = 127.0.0.1 ,
            // remote port = 4723 , remote path = /wd/hub
            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            // pass URL and desired capabilities through AndroidDriver
            driver = new AndroidDriver(url, dc);

            // provide implicit wait of 10 seconds
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot1");
        }
        // handle the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickOn(MobileElement element){
        // use try and catch block to handle the exceptions
        try{
            // create an object of TapAction class and tap on an element using tap() method
            TouchAction action = new TouchAction(driver);
            action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)))
                    .release().perform();

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot2");
        }
        // handle the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void selectCountry(String country){
        // use try and catch block to handle the exceptions
        try{
            // get the id of country selector box
            MobileElement clickCountry = (MobileElement) driver.findElement(Locators.clickCountry);

            // tap on this box using tapOptions() defined in clickOn() method
            clickOn(clickCountry);

            // scroll to the country india and click on it
            MobileElement scroll = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"India\").instance(0))");
            clickOn(scroll);

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot3");

        }
        // handle the exception using catch block
        catch(Exception e){

            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void enterName(String name){
        // use try and catch block to handle the exceptions
        try{
            // enter the name
            MobileElement clickName = (MobileElement) driver.findElement(Locators.clickName);
            clickName.sendKeys(name);

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot4");
        }
        // handle the exception using catch block
        catch(Exception e){

            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void selectGender(String gender){
        // use try and catch block to handle the exceptions
        try{
            // select the gender as female
            MobileElement clickGender = (MobileElement) driver.findElement(Locators.clickGender);
            clickOn(clickGender);

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot5");
        }
        // handle the exception using catch block
        catch(Exception e){

            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void selectLetsShop(String shop){
        // use try and catch block to handle the exceptions
        try{
            // click on lets shop button
            MobileElement clickLetsShop = (MobileElement) driver.findElement(Locators.clickLetsShop);
            clickOn(clickLetsShop);

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot6");
        }
        // handle the exception using catch block
        catch(Exception e){

            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void handleToastMessage(){
        // use try and catch block to handle the exceptions
        try{
            // handle the toast message and print it .
            MobileElement toast = (MobileElement) driver.findElement(Locators.toast);
            System.out.println("Toast message : "+ toast.getText());

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot6");
        }
        // handle the exception using catch block
        catch(Exception e){

            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void addShoe(String shoe){
        // use try and catch block to handle the exceptions
        try{
            // add shoe in cart
            MobileElement clickShoe = (MobileElement) driver.findElement(Locators.clickShoe);
            clickOn(clickShoe);

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot7");
        }
        // handle the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void addAnotherShoe(String shoe){
        // use try and catch block to handle the exceptions
        try{
            // scroll to Jorden 6 rings shoe
            driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Jordan 6 Rings\").instance(0))");

            // click on shoe
            MobileElement clickShoe = (MobileElement) driver.findElement(Locators.clickAnotherShoe);
            clickOn(clickShoe);

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot8");
        }
        // handle the exception using catch block
        catch(Exception e){

            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void clickCart(){
        // use try and catch block to handle the exceptions
        try{
            // click on cart
            MobileElement cart = (MobileElement) driver.findElement(Locators.cart);
            clickOn(cart);

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot9");
        }
        // handle the exception using catch block
        catch(Exception e){
            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
    public static void checkShoePresence(String shoeName, String anotherShoeName){
        // use try and catch block to handle the exceptions
        try{
            // get the id of both the shoes
            MobileElement firstShoeName = (MobileElement) driver.findElement(Locators.firstShoeName);
            MobileElement secondShoeName = (MobileElement) driver.findElement(Locators.secondShoeName);

            // check if shoes are displayed or not and print desired results
            if(firstShoeName.isDisplayed() && secondShoeName.isDisplayed()){
                Loggers.logger.info("Both the shoes are added to cart");
            }
            else{
                Loggers.logger.info("shoes are not added to the cart");
            }

            // take screenshot
            Screenshots.takeScreenShot(driver,"screenshot10");
        }
        // handle the exception using catch block
        catch(Exception e){

            // print the stack trace of exception to the console
            e.printStackTrace();
        }
    }
}
