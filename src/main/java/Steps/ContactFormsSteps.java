package Steps;

import Elements.ContactFormsElement;
import com.codeborne.selenide.Condition;

public class ContactFormsSteps extends ContactFormsElement {

    public void userName(String username){
        firstName.setValue(username);
    }
    public void userLastName(String LastName){
        lastName.setValue(LastName);
    }
    public void email(String emailAddress){
        emailValue.setValue(emailAddress);
    }
    public void commentText (String comment){
        commentsText.setValue(comment);
    }
    public void clickSubmit(){
        submitButton.click();
    }
    public void checkHeaderText(String text) {
        headerText.shouldHave(Condition.text(text));
    }
}
