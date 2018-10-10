package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class Paper extends BaseUtil {

    @FindBy(id = "navGroup2")
    public static WebElement papers;

    public void hovPapers() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(papers).perform();
        System.out.println(papers.getText());
        //actions.moveToElement(mailingPackingAndShipping).click().perform();
    }
    public List<String> getTextOfPaper(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> items = getTextFromWebElements(papers);
        return items;
    }
}