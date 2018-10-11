package homePageObjectTest;

import homePageObject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends HomePage {

    HomePage objHomePage;
    @BeforeMethod
    public void initializePage(){
        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testSignInToHnM(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objHomePage.signInToHnM();
    }

    @Test
    public void testSignInLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInLink.isEnabled();
    }
    @Test
    public void testSendValueToEmailBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInLink.click();
        objHomePage.sendValueToEmailBox();
    }
    @Test
    public void testNavigateToMensPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objHomePage.navigateToMensPage();
    }
    @Test
    public void testNavigateToWomenPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objHomePage.navigateToWomenPage();
    }
    @Test
    public void testCheckOutSaleLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objHomePage.checkOutSaleLink();
    }
    @Test
    public void testSearchItem(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objHomePage.searchItem();
    }
}
