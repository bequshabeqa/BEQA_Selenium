package Practice_2;

import Steps.HoverSteps;
import Utils.SetUp;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class HoverTests extends SetUp {

    HoverSteps hoverSteps = new HoverSteps();


    @Test
    public void hoverTest() {

        open("https://webdriveruniversity.com/Actions/index.html");

        hoverSteps.hoverOnElement();
        hoverSteps.clickOnLink();
        hoverSteps.checkAlertText("Well done you clicked on the link!");
    }
}
