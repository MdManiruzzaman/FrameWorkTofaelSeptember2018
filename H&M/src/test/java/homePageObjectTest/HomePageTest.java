package homePageObjectTest;

import homePageObject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {

    HomePage objHomePage;
    @BeforeMethod
    public void initializePage(){
        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testSignInToHnM(){
        objHomePage.signInToHnM();
    }
    @Test
    public void testSignInLink(){
        signInLink.isEnabled();
    }
    @Test
    public void testSendValueToEmailBox(){
        signInLink.click();
        objHomePage.sendValueToEmailBox();
    }
}
