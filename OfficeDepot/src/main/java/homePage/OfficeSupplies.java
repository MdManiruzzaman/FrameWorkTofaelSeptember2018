package homePage;


import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class OfficeSupplies extends BaseUtil {

    @FindBy(id = "navGroup1")
    public static WebElement officeSupplies;
    @FindBy(xpath = "//*[@id=\"sg1676\"]/div/div/div[1]/div[1]/ul/li[1]/a/span")
    public static WebElement mailingPackingAndShipping;
    /*@FindBy(xpath = "//*[@id=\"featuredMatrix\"]/div/div/div[1]/div[1]/a/span[1]")
    public static WebElement envelops;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/ul/li[2]/ul/li[1]/div/div/ul/li[3]/ul/li[1]/a")
    public static WebElement mailers;*/


    //define methods for above element
    public void checkOfficeSupplies(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions=new Actions(driver);
        actions.moveToElement(officeSupplies).perform();
        actions.moveToElement(mailingPackingAndShipping).click().perform();
        //actions.moveToElement(envelops).click();
        //actions.moveToElement(mailers).click();

    }

}
