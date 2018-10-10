package homePageTest;

import homePage.Account;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

//import dataProviderXls.XlsDataReaderUtil;
//import org.testng.annotations.DataProvider;

public class AccountTest extends Account {
    Account account;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        account = PageFactory.initElements(driver, Account.class);
    }
    @Test
    public void accountTest () throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        account.checkAccount();

        List<String> expected = new ArrayList<>();
        expected.add("ACCOUNT");
        expected.add("LOG IN");
        expected.add("or Create An Account");
        expected.add("My Account");
        expected.add("My Rewards");
        expected.add("Order Tracking & History");
        expected.add("Subscriptions Manager");
        expected.add("Payment Options");
        expected.add("Submit Return");
        expected.add("Reorder");
        expected.add("My Files");
 //       Assert.assertEquals(actual, expected);
    }

}