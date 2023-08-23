package locators;

import org.openqa.selenium.By;

public class Locators {
    public static By clickCountry = By.id("android:id/text1");
    public static By clickName = By.id("com.androidsample.generalstore:id/nameField");
    public static By clickGender = By.id("com.androidsample.generalstore:id/radioFemale");
    public static By clickLetsShop = By.id("com.androidsample.generalstore:id/btnLetsShop");
    public static By toast = By.xpath("//android.widget.Toast");
    public static By clickShoe = By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[1]");
    public static By clickAnotherShoe = By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[2]");
    public static By firstShoeName = By.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']");
    public static By secondShoeName = By.xpath("//android.widget.TextView[@text='Jordan 6 Rings']");
    public static By cart = By.id("com.androidsample.generalstore:id/appbar_btn_cart");
}
