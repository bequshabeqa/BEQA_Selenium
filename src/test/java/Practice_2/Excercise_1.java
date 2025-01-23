package Practice_2;

import Steps.AuthSteps;
import Steps.DropDownSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Excercise_1 {

    AuthSteps authSteps = new AuthSteps();
    DropDownSteps dropDownSteps = new DropDownSteps();


    @Test
    public void authTest() {

    open("https://the-internet.herokuapp.com/login");

    authSteps.setUserName("tomsmith");
    authSteps.setUserPassword("SuperSecretPassword!");
    authSteps.clickLogin();
    authSteps.checkFlashMessageTest("You logged into a secure area!");
    authSteps.checkHeaderText("Secure Area");
    }
}
