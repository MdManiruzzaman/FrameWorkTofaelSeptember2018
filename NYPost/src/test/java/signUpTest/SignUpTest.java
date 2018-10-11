package signUpTest;

import homePage.HomePage;
import org.testng.annotations.Test;

import signUp.SignUp;

public class SignUpTest extends HomePage {

    SignUp objectSignUP;


    @Test
    public void testTitleHeader() {
        objectSignUP.setTitleHeader();
    }
    @Test
    public void testContactEmail() {
        objectSignUP.setContactEmail();
    }
    @Test
    public void testSignUpButton() {
        objectSignUP.setSignUpButton();
    }
    //@Test
    /*public void signUpTest2(){
        signUp2();
    }*/


}