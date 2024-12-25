package Practice_2;

import Steps.AlertSteps;
import Utils.SetUp;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class AlertTest extends SetUp {

    AlertSteps alertSteps = new AlertSteps();


    @Test
    public void AlertTest() {

        open("https://the-internet.herokuapp.com/javascript_alerts");


    }
}
