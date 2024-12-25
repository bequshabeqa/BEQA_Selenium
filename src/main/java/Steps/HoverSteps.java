package Steps;

import Elements.HeroElement;
import Elements.HoverElements;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.switchTo;

public class HoverSteps extends HoverElements {

    public void hoverOnElement() {
        hoverElement.hover();
    }

    public void clickOnLink(){
        link.click();
    }

    public void checkAlertText(String alertText){
        Assert.assertTrue(switchTo().alert().getText().contains(alertText));
    }
}
