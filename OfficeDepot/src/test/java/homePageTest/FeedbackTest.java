package homePageTest;

import homePage.Feedback;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class FeedbackTest extends Feedback {
    Feedback objFeedback;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objFeedback = PageFactory.initElements(driver, Feedback.class);
    }
    @Test
    public void testFeedback() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objFeedback.checkFeedback();
    }
    /*@Test
    public void feedbackTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        switchToFrame1();
    }*/
}