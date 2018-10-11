package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseUtil {

    @FindBy(xpath = "//*[@id=\"header-logo-wrapper\"]")
    public static WebElement logo;
    @FindBy(css= "#sections > span.nav-text")
    public static WebElement Sections;
    @FindBy(xpath = "//*[@id=\"search\"]/span[2]")
    public static WebElement SearchBox;
    @FindBy(xpath = "//*[@id=\"sign-up\"]/span")
    public static WebElement signUp;
    @FindBy(xpath = "//*[@id=\"tips\"]/span")
    public static WebElement tips;
    @FindBy (xpath = "//*[@id=\"search\"]/span[2]")
    public static WebElement searchButton;

    public HomePage() {}; //default constructor

    public HomePage(WebDriver driver) {  //2nd constructor
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean logo(){
        boolean displayed = logo.isDisplayed();
        boolean enabled = logo.isEnabled();
        return enabled;
    }
    public void setLogo(){

        logo.click();
    }
    public void setSections(){

        Sections.click();
    }
    public void setSearchBox() {
        SearchBox.click();
    }
    public void setSignUp(){
        signUp.click();
    }
    public void setSearchButton(){
        searchButton.click();
    }
    public void setTips(){
        tips.click();
    }
    public void searchBox(){
        typeOnInputField("//*[@id=\"search-field\"]","schedule");
        searchButton.click();
    }
}





