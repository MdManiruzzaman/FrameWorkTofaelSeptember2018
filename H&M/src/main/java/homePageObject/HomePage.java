package homePageObject;

import base.BaseUtil;
import org.openqa.selenium.Keys;
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

    @FindBy(xpath = "//*[@id=\'main-search\']")
    public static WebElement searchbox;

    public void sendValueToEmailBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        email.sendKeys("value");
    }

    public void signInToHnM(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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

    public void navigateToMensPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        menLink.click();
    }

    public void navigateToWomenPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        womenLink.click();
    }

    public void checkOutSaleLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        saleLink.isEnabled();
    }

    public void searchItem(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchbox.click();
        searchbox.sendKeys("laal Jainga for boro hujur", Keys.ENTER);
    }
}
