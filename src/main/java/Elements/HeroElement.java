package Elements;

import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HeroElement {

    public SelenideElement UserName = $(By.id("username")).setValue("tomsmith");
    public SelenideElement password = $(By.id("password")).setValue("SuperSecretPassword!");

    public SelenideElement Button = $x("//*[@id=\"login\"]/button");

}
