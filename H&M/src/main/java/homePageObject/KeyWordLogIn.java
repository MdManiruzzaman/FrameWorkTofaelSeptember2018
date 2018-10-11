package homePageObject;

import base.BaseUtil;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

public class KeyWordLogIn extends BaseUtil {
    @FindBy(xpath = "//a[@class='goto-sign-in rollover-toggle']")
    public static WebElement signInLink;
    @FindBy(xpath = "//*[@id=\'signin-rollover-email\']")
    public static WebElement email;
    @FindBy(xpath = "//*[@id=\'signin-rollover-password\']")
    public static WebElement password;
    @FindBy(xpath = "//*[@id=\'loginBtnSubmit\']")
    public static WebElement signInButton;

    public void signInToHnM(){
        signInLink.click();
        email.sendKeys("ahmedPagol");
        password.sendKeys("fahimFanku");
        signInButton.click();
    }

    public void executeActions(String feature) throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        switch (feature){
            case "SignIn":
                signInToHnM();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature");
        }
    }
    DataReader reader = new DataReader();
    public String[] getDataFromSignInKeyWord(String fileName) throws IOException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = "../H&M/data/" + fileName;
        String[] output = reader.colReader(path, 2);
        return output;
    }
    public void signInByKeyWord() throws  IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String[] keyword = getDataFromSignInKeyWord("KeyWordDriven.xls");
        for (int i = 0; i < keyword.length; i++){
            executeActions(keyword[i]);
        }
    }
}
