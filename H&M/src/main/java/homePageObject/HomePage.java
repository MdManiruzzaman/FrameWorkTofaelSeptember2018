package homePageObject;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends BaseUtil {

    @FindBy(xpath = "//a[@class='goto-sign-in rollover-toggle']")
    public static WebElement signInLink;
    @FindBy(xpath = "//*[@id=\'signin-rollover-email\']")
    public static WebElement email;
    @FindBy(xpath = "//*[@id=\'signin-rollover-password\']")
    public static WebElement password;
    @FindBy(xpath = "//*[@id=\'loginBtnSubmit\']")
    public static WebElement signInButton;
    @FindBy(xpath = "//*[@id=\'signin-rollover-password-minlength-error\']")
    public static WebElement errorMessage;

    @FindBy(xpath = "//a[@href='/en_us/men.html']")
    public static WebElement menLink;
    @FindBy(xpath = "//a[@href='/en_us/kids.html']")
    public static WebElement kidsLink;
    @FindBy(xpath = "//a[@href='/en_us/women.html']")
    public static WebElement womenLink;
    @FindBy(xpath = "//a[@href='/en_us/sale.html']")
    public static WebElement saleLink;

    public void sendValueToEmailBox(){
        email.sendKeys("value");
    }


    public void signInToHnM(){
        signInLink.click();
        email.sendKeys("ahmedFagol");
        password.sendKeys("fahimFanku");
        signInButton.click();
    }
    public void signInByDataProvider(String userEmail, String passCode) throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        email.sendKeys(userEmail);
        password.sendKeys(passCode);
        signInButton.click();
        Thread.sleep(3000);
    }
}
