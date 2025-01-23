package Elements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class AlertElement {

    public SelenideElement buttonClick = $x("//*[@id=\"content\"]/div/ul/li[2]/button");

    public SelenideElement Button = $x("//*[@id=\"content\"]/div/ul/li[2]/button");

    public void checkAlertText(String message) {

    }
}
