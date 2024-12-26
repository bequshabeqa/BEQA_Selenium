package Steps;

import Elements.AlertElement;
import com.codeborne.selenide.Selectors;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AlertSteps extends AlertElement {

    public void actions() throws FileNotFoundException {
        buttonClick.click();

    }

    public void checks() {
        $(Selectors.byId("result")).shouldBe(visible);
    }
}
