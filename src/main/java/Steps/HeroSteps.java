package Steps;

import Elements.HeroElement;
import com.codeborne.selenide.Condition;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.switchTo;

public class HeroSteps extends HeroElement {

    public void actions() throws FileNotFoundException {
        UserName.click();
        password.click();
        Button.click();
    }
    public void checks() {
        switchTo().window("Secure Area");
    }
}
