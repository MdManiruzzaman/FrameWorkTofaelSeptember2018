package homePageObjectTest;

import homePageObject.KeyWordLogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class KeyWordLogInTest extends KeyWordLogIn {

    KeyWordLogIn objKeyWordLogIn;
    @BeforeMethod
    public void initializePage(){
        objKeyWordLogIn = PageFactory.initElements(driver, KeyWordLogIn.class);
    }
    @Test
    public void testKeyWordLogIn() throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objKeyWordLogIn.signInToHnM();
    }
}
