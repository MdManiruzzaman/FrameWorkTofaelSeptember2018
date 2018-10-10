package homePage;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

public class Search extends BaseUtil {
    @FindBy(id = "mainSearchField")
    public static WebElement searchTextBox;
    @FindBy(id = "searchSubmit")
    public static WebElement searchIcon;

    public static  void waitToBeVisible(){
        TestLogger.log(Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchIcon.click();
        wait.until(ExpectedConditions.visibilityOf(searchTextBox));
    }
    public void searchWithENTER(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        searchTextBox.sendKeys(searchKeys, Keys.ENTER);
    }
    public void searchUsingButton(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        searchTextBox.sendKeys(searchKeys);
        searchIcon.click();
    }
}
