package Steps;

import Elements.AuthElements;
import com.codeborne.selenide.Condition;

public class AuthSteps extends AuthElements {

    public void setUserName(String username){
        userNameInput.setValue(username);
    }

    public void setUserPassword(String password){
        userPasswordInput.setValue(password);
    }

    public void clickLogin(){
        loginButton.click();
    }

    public void checkFlashMessageTest(String message) {
        flashMessage.shouldHave(Condition.text(message));
    }
    public void checkHeaderText(String text) {
        headerText.shouldHave(Condition.text(text));
    }
}
