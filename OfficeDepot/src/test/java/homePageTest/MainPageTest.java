package homePageTest;

import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MainPageTest extends MainPage {
    MainPage objectMainPage;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testFreeDelivery() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkFreeDelivery();
    }
    @Test
    public void testPickUp1Hr() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkPickUp1Hr();
    }
    @Test
    public void testWeeklyAd() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkWeeklyAd();
    }
    @Test
    public void testEmployeeBusiness20() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkEmployeeBusiness20();
    }
    @Test
    public void testChatOrCall() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkChatOrCall();
    }
    @Test
    public void testLogInOrRegister() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkLoginOrRegister();
    }
    @Test
    public void testLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkLogo();
    }
    @Test
    public void testIdeas() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkIdeas();
    }
    @Test
    public void testAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkAccount();
    }
    @Test
    public void testStores() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkStores();
    }
    @Test
    public void testCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkCart();
    }
    //NavigationBar
    @Test
    public void testOfficeSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkOfficeSupplies();
    }
    @Test
    public void testPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkPaper();
    }
    @Test
    public void testInkAndToner() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkInkAndToner();
    }
    @Test
    public void testBreakRoom() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkBrakeRoom();
    }
    @Test
    public void testCleaning() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkCleaning();
    }
    @Test
    public void testTechnology() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkTechnology();
    }
    @Test
    public void testFurniture() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkFurniture();
    }
    @Test
    public void testSchoolSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkSchoolSupplies();
    }
    @Test
    public void testPrintAndCopy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkPrintAndCopy();
    }
    @Test
    public void testServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkServices();
    }
    @Test
    public void testDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkDeals();
    }
    @Test
    public void testPhoneNumber() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkPhoneNumber();
    }
    @Test
    public void testLiveChat() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkLiveChat();
    }
    @Test
    public void testFreeDelivery2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkFreeDelivery();
    }
    @Test
    public void testTapAway() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkTapAway();
    }
    @Test
    public void testSignUpForExclusiveOffer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objectMainPage.checkSignUpForExclusiveOffer();
    }
}