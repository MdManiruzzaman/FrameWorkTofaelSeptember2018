package signUp;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends BaseUtil {

    @FindBy(xpath = "/html/body/div[3]/div/div[1]/h2")
    public static WebElement titleHeader;
    @FindBy(id = "contact_fields_email")
    public static WebElement contactEmail;
    @FindBy(xpath = "/html/body/div[3]/div/form/div[1]/div/div[2]/i")
    public static WebElement signUpButton;


    public SignUp() {
    }

    public void setTitleHeader() {

        titleHeader.click();
    }

    public void setContactEmail() {

        contactEmail.click();
    }

    public void setSignUpButton() {

        signUpButton.click();
    }
    /*public void signUp2(){

        setSignUp();*/



}

//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//  contactEmail.click();


