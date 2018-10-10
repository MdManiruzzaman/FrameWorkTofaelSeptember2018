package homePageTest;

import homePage.MainPage;
import homePage.Paper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

//import dataProviderXls.XlsDataReaderUtil;
//import org.testng.annotations.DataProvider;

public class PaperTest extends Paper {
    MainPage mainPage;
    Paper paper;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage = PageFactory.initElements(driver, MainPage.class);
        paper = PageFactory.initElements(driver, Paper.class);
    }
    @Test
    public void paperTestHoveOver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkPaper();
        paper.hovPapers();
        /*List<String> itemOfDropdown = getTextOfPaper();
        for (String e : itemOfDropdown) {
            System.out.println(e);
        }
        List<String> actual = new ArrayList<>();
        actual.add("Copy & Printer Paper");
        actual.add("Notebooks & Pads");
        actual.add("Business & Digital Printing Paper");
        actual.add("Cash Register & Thermal Rolls");
        actual.add("Invitations & Cards");
        actual.add("Post-It & Sticky Notes");
        actual.add("Certificates & Covers");
        actual.add("Colored Paper");
        actual.add("Art & Craft Paper");
        actual.add("Filler & Graph Paper");
        actual.add("Index Cards");
        Assert.assertEquals(actual, itemOfDropdown);*/
    }
}