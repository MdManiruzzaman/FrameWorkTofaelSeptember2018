package homePageTest;

import homePage.GoogleSheetPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class GoogleSheetPageTest extends GoogleSheetPage {
    GoogleSheetPage objGoogleSheetsPage;

    @BeforeMethod
    public void initialization(){
        objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetPage.class);
    }
    // Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objGoogleSheetsPage.clickOnSignInLink();
        int i = 0;
        String spreadsheetId = "1ReKCW-Uca67fxtKPt5QOT3eypNzr5qL578kmp0Jb0AU";
        String range = "Sheet1!A2:B";
        objGoogleSheetsPage.signInWithValidIdPass(spreadsheetId, range);

        System.out.println("testsignInWithValidIdPass Passed");
    }
}
