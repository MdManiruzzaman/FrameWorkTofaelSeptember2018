
package sections;

import base.BaseUtil;
import homePage.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Sections extends BaseUtil {

    public Sections() {
    }

    public Sections(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"sections\"]/span[2]")
    public static WebElement getSections;
    /*@FindBy(xpath = "//*[@id=\"sections\"]/span[1]/svg/path")
    public static WebElement getSectionsBar;*/
    @FindBy(xpath = "//*[@id=\"menu-item-1612774\"]/a")
    public static WebElement getNews;
    @FindBy(xpath = "//*[@id=\"menu-item-1612773\"]/a")
    public static WebElement getMetro;
    @FindBy(xpath = "//*[@id=\"menu-item-1612779\"]/a")
    public static WebElement getPageSix;

    public void clickNews(){
        getSections.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        getNews.click();
    }
    public void clickMetro(){
        getSections.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        getMetro.click();
    }
    public void clickPageSix(){
        getSections.click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        getPageSix.click();
    }

}