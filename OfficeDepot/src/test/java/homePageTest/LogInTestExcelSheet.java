package homePageTest;

import homePage.Login;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LogInTestExcelSheet extends Login{
    Login loginObject;
    @BeforeMethod
    public void init(){
        loginObject = PageFactory.initElements(driver,Login.class);
    }
    @Test
    public void submitLogInButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        setSubmitLogInButton();
    }
    @Test
    public void forgotLogInNameOrPassword (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //setForgotLogInNameOrPassword();
    }
    @Test
    public void acessYourRewards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //setAccessYourRewards();
        setCreatAnAccount();
    }

    /*@Test(dataProvider = "supplyData")
    public void signInWithInvalidIDPassUsingExcel(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        navigateToLoginPage();
        String errMessage = SendLoginInfo(email, passCode);
        Assert.assertEquals(message,errMessage);
    }*/
}
