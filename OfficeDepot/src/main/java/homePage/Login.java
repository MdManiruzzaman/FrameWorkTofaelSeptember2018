package homePage;

import base.BaseUtil;
import dataReaderCommonClass.XlsDataReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.Iterator;

public class Login extends BaseUtil {
    @FindBy(className = "login_state")
    public static WebElement openLogInButton; //kaj koi
    /*@FindBy(linkText = "Login or Register")
    public static WebElement loginLink;*/
    @FindBy(xpath = "//*[@id=\"loginOD\"]/ul/li[1]/input")
    public static WebElement emailTextBox;
    /*@FindBy(xpath = "//div[@class='address editable']//input[@name='loginName']")
    public static WebElement emailTextBox;*/
    /*@FindBy(xpath = "//*[@id=\"loginOD\"]/ul/li[2]/input")
    public static WebElement passwordTextBox;*/
    @FindBy(xpath = "//div[@class='address editable']//input[@name='password']")
    public static WebElement passwordTextBox;
    @FindBy(css = ".btn.arrow.sm_txt.js_loginBtn")
    public static WebElement submitLogInButton;
    @FindBy(xpath = "//ul[@class='errorList clear']/li")
    public static WebElement errorMessage;
    //how to get it, ask
    @FindBy(xpath = "//*[@id=\"modalLoginPwdResetSQA\"]")
    public static WebElement forgotLogInNameOrPassword;
    @FindBy(xpath = "//*[@id=\"gigyaStyle\"]/aside/ul/li[1]/a")
    public static WebElement creatAnAccount;
    @FindBy(xpath = "//*[@id=\"activateAccountLoyalty\"]/a")
    public static WebElement AccessYourRewards;

    /*public static void navigateToLoginPage(){
        TestLogger.log(Login.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.navigate().to("https://www.officedepot.com/account/loginAccountSet.do");
        loginLink.click();
    }*///need to know how to get this address in above line
    public void setSubmitLogInButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        submitLogInButton.click();
    }
    /*public void setForgotLogInNameOrPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        forgotLogInNameOrPassword.click();
    }*/
    public void setCreatAnAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        creatAnAccount.click();
    }
    /*public void setAccessYourRewards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AccessYourRewards.click();
    }*/
    public void clearInputBox(WebElement webElement){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        webElement.clear();
    }
    public String SendLoginInfo(String email, String password) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginContentBody")));
        driver.findElement(By.cssSelector(".ui-icon.ui-icon-closethick")).click();
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
        Thread.sleep(2000);
        setSubmitLogInButton();
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userPassword-msgs")));
        String errMessage = errorMessage.getText();
        clearInputBox(emailTextBox);
        clearInputBox(passwordTextBox);
        return errMessage;
    }
    @DataProvider
    public Iterator<Object[]> supplyData(){
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcelFM();
        return testData.iterator();
    }
}


