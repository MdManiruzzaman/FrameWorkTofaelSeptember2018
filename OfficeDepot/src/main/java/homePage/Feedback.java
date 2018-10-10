package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Feedback extends BaseUtil {
    @FindBy (className = "oo_tab_left")
    public WebElement feedbackTab;
    @FindBy(id = "oo_waypoint_company_logo")
    public WebElement iframe1;
    @FindBy(id = "oo_waypoint_content")
    public WebElement iframe2;
    @FindBy(xpath = "//p[@id='waypoint_icons']//a[1]")
    public WebElement websiteFeedback;
    @FindBy(xpath = "//p[@id='waypoint_icons']//a[2]")
    public WebElement storeFeedback;
    @FindBy(xpath = "//a[@class='waypoint_icon last']")
    public WebElement otherFeedback;
    @FindBy(xpath = "//span[@aria-hidden='true']")
    public static WebElement closeDialogue;

    public void checkFeedback(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        feedbackTab.click();
    }
    /*public void switchToFrame1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible(feedbackTab);
        System.out.println(feedbackTab.getText());
    }
    public void switchToFrame2(){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe2));
        feedbackTab.click();
    }*/
    /*public static void switchToFrame1(){
        TestLogger.log(Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        closeDialogue.click();
        wait.until(ExpectedConditions.visibilityOf(closeDialogue));
    }*/
    /*public void clickWebsiteFeedback(){
        websiteFeedback.click();
    }
    public void clickStoreFeedback() {
        storeFeedback.click();
    }
    public void clickOtherFeedback(){
        otherFeedback.click();
    }
    public void clickCloseDialogue(){
        closeDialogue.click();
    }
    public void checkFeedback(){
        switchToFrame1();
        //switchToFrame2();
        clickWebsiteFeedback();
        clickStoreFeedback();
        clickOtherFeedback();
        clickCloseDialogue();
        driver.switchTo().defaultContent();
    }*/
}

