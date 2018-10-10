package homePageTest;

import homePage.OfficeSupplies;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class OfficeSuppliesTest extends OfficeSupplies{
    OfficeSupplies objOfficeSupplies;

    @BeforeMethod
    public void initElement(){
        objOfficeSupplies = PageFactory.initElements(driver, OfficeSupplies.class);
    }
    @Test
    public void officeSuppliesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objOfficeSupplies.checkOfficeSupplies();
    }
}