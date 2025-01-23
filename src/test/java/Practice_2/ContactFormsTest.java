package Practice_2;

import Steps.ContactFormsSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class ContactFormsTest {

    ContactFormsSteps contactFormsSteps = new ContactFormsSteps();


    @Test
    public void ContactTest() {

        open("https://webdriveruniversity.com/Contact-Us/contactus.html");

        contactFormsSteps.userName("John");
        contactFormsSteps.userLastName("Doe");
        contactFormsSteps.email("johndoe@example.com");
        contactFormsSteps.commentText("This is a test message.");
        contactFormsSteps.clickSubmit();
        contactFormsSteps.checkHeaderText("Thank You for your Message!");
    }
}
