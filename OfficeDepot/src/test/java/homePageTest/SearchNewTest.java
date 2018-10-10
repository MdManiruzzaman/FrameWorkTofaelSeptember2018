package homePageTest;

import homePage.SearchNew;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class SearchNewTest extends SearchNew {
    SearchNew objSearchNew;

    @BeforeMethod
    public void initializePage(){
        objSearchNew = PageFactory.initElements(driver, SearchNew.class);
    }
    @Test
    public void testGetItemValue(){
        objSearchNew.getItemValue();
    }
    @Test
    public void testGetList(){
        objSearchNew.listOfText();
    }
    /*@Test
    public void test3() throws InterruptedException, IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchNew searchPage = PageFactory.initElements(driver, SearchNew.class);
        searchPage.mouseHover();
    }
    @Test
    public void testMouseHover()throws IOException,InterruptedException{
        objSearchNew.mouseHover();
    }*/

}
