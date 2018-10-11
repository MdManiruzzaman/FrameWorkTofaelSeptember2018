package homePageTest;

import homePage.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    @BeforeMethod
    public void initialization() {
        HomePage homePage = new HomePage(driver);
    }
    @Test
    public void openNYPost() throws InterruptedException {
        Sections.click();
    }
    @Test
    public void testLogo() {
        setLogo();
    }
    @Test
    public void testSections() {
        setSections();
    }
    @Test
    public void testSetGetSearchBox() {
        setSearchBox();
    }
    @Test
    public void testSignUp() {
        setSignUp();
    }
    @Test
    public void testSearchButton() {
        setSearchButton();
    }
    @Test
    public void testTips() {
        setTips();
    }
}



