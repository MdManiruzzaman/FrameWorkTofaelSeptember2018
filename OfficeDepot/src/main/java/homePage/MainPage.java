package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
//***************** Banner *************************
    @FindBy (id = "header_banner1")
    public static WebElement freeDelivery;
    @FindBy (id = "header_banner2")
    public static WebElement pickUp1Hr;
    @FindBy (className= "weeklyAdLink")
    public static WebElement weeklyAd;
    @FindBy (xpath = "//a[@href='https://business.officedepot.com?cm_sp=header-_-topline-_-office_depot_business_solutions'][contains(text(),'20+ Employee Businesses')]")
    public static WebElement employeeBusiness20;
    @FindBy (className= "cs_call_chat_txt")
    public static WebElement chatOrCall;
    @FindBy (className= "login_state")
    public static WebElement loginOrRegister;
//****************** Header **************************
    @FindBy(id = "od_omx_integration_logo")
    public static WebElement logo;
    @FindBy(id = "headerIdeas")
    public static WebElement ideas;
    @FindBy(id = "headerAccount")
    public static WebElement account;
    @FindBy(id = "headerStores")
    public static WebElement stores;
    @FindBy(id = "headerCart")
    public static WebElement cart;
//***************** NavigationBar ***************
    @FindBy(id = "navGroup1")
    public static WebElement officeSupplies;
    @FindBy(id = "navGroup2")
    public static WebElement paper;
    @FindBy(id = "inkNav")
    public static WebElement inkAndToner;
    @FindBy(id = "navGroup3")
    public static WebElement breakRoom;
    @FindBy(id = "navGroup4")
    public static WebElement cleaning;
    @FindBy(id = "navGroup5")
    public static WebElement technology;
    @FindBy(id = "navGroup6")
    public static WebElement furniture;
    @FindBy(id = "navGroup7")
    public static WebElement schoolSupplies;
    @FindBy(id = "navGroup8")
    public static WebElement printAndCopy;
    @FindBy(id = "servicesNav")
    public static WebElement services;
    @FindBy(id = "navGroup12")
    public static WebElement deals;
//******************** Media **********************
    @FindBy(id = "csPhoneNumber")
    public static WebElement phoneNumber;
    @FindBy(className = "live_chat_txt")
    public static WebElement liveChat;
    @FindBy(className = "icon pick_up")
    public static WebElement freeStorePickup;
    @FindBy(xpath = "//*[@id=\"footer_www\"]/div/div[2]/div[4]/div/a/span[1]")
    public static WebElement tapAway;
    @FindBy(className = "sign_up_txt")
    public static WebElement signUpForExclusiveOffer;


    //Banner
    public void checkFreeDelivery(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        freeDelivery.click();
    }
    public void checkPickUp1Hr(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pickUp1Hr.click();
    }
    public void checkWeeklyAd(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        weeklyAd.click();
    }
    public void checkEmployeeBusiness20(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        employeeBusiness20.click();
    }
    public void checkChatOrCall(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        chatOrCall.click();
    }
    public void checkLoginOrRegister(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        loginOrRegister.click();
    }
    //Header
    public void checkLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    public void checkIdeas(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ideas.click();
    }
    public void checkAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        account.click();
    }
    public void checkStores(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        stores.click();
    }
    public void checkCart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cart.click();
    }
    //NavigationBar
    public void checkOfficeSupplies(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        officeSupplies.click();
    }
    public void checkPaper(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        paper.click();
    }
    public void checkInkAndToner(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        inkAndToner.click();
    }
    public void checkBrakeRoom(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        breakRoom.click();
    }
    public void checkCleaning(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cleaning.click();
    }
    public void checkTechnology(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        technology.click();
    }
    public void checkFurniture(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        furniture.click();
    }
    public void checkSchoolSupplies(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        schoolSupplies.click();
    }
    public void checkPrintAndCopy(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        printAndCopy.click();
    }
    public void checkServices(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        services.click();
    }
    public void checkDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        deals.click();
    }
    public void checkPhoneNumber(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        phoneNumber.click();
    }
    public void checkLiveChat(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        liveChat.click();
    }
    public void checkFreeStorePickup(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        freeStorePickup.click();
    }
    public void checkTapAway() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sleepFor(1);
        tapAway.click();
    }
    public void checkSignUpForExclusiveOffer(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signUpForExclusiveOffer.click();
    }
}
