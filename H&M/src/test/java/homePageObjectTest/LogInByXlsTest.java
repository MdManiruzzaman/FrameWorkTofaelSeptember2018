package homePageObjectTest;

import homePageObject.HomePage;
import homePageObject.LogInByXls;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utility.DataReader;

public class LogInByXlsTest extends LogInByXls {
    DataReader dtr = new DataReader();

    HomePage objHomePage;

    @BeforeMethod
    public void initializePageObject() {
        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test(priority = 5, dataProvider = "supplyDataExcel")
    public void loginTestWithDataProvider(String email, String passCode, String message) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objHomePage.signInByDataProvider(email,passCode);
        String actual = objHomePage.errorMessage.getText();
        Assert.assertEquals(actual,message);
    }



}
