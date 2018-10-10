package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class Account extends BaseUtil {

    @FindBy(id = "headerAccount")
    public static WebElement account;

    public void checkAccount() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(account).perform();
        sleepFor(1);
        System.out.println(account.getText());

        //actions.moveToElement(mailingPackingAndShipping).click().perform();
    }
    public List<String> getTextOfAccount() throws InterruptedException {
       // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(account).perform();
        sleepFor(1);
        List<String> items = getTextFromWebElements(account);
        return items;
    }
}