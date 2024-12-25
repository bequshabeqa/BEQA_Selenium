package Practice_2;

import Steps.AuthSteps;
import Steps.DropDownSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Excercise_2 {

    AuthSteps authSteps = new AuthSteps();
    DropDownSteps dropDownSteps = new DropDownSteps();

    @Test
    public void dropDownCheck() {

        open("https://the-internet.herokuapp.com/dropdown");

        dropDownSteps.selectOptions("Option 1");
        dropDownSteps.checkSelectionOption("Option 1");
    }
}
