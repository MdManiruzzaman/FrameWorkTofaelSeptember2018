package homePage;

import base.BaseUtil;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

import static googleAPIs.GoogleSheetReader.getSheetsService;

public class GoogleSheetPage extends BaseUtil {
    @FindBy(xpath = "//*[@id=\"globalList\"]/li[7]/ul/li[3]/a")
    public static WebElement signInLink;
    @FindBy(xpath = "//*[@id=\"loginOD\"]/ul/li[1]/input")
    public static WebElement emailTextBox;
    @FindBy(xpath = "//*[@id=\"loginOD\"]/ul/li[2]/input")
    public static WebElement passwordTextBox;
    @FindBy(css = "//*[@id=\"loginOD\"]/section/ul/li[1]/input")
    public static WebElement submitLogInButton;

    public void dakteAsiHoyKina(){
    }
    /*public void signInWithWebElement(WebElement element1, WebElement element2){
        element1.sendKeys();
        element2.sendKeys();
    }*/
    public void clickOnSignInLink(){
        signInLink.click();
    }
     public void signInByValidIdInfo(){
        emailTextBox.sendKeys();
    }
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    //LogIn by using Google Sheet sheet data
    public void signInWithValidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        //List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(emailTextBox, row.get(0).toString());
            inputValueInTextBoxByWebElement(passwordTextBox, row.get(1).toString());
            submitLogInButton.click();
            clearInputBox(emailTextBox);
            clearInputBox(passwordTextBox);
            sleepFor(1);
        }
    }
}