package Elements;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AuthElements {

    public SelenideElement userNameInput = $(Selectors.byId("username"));

    public SelenideElement userPasswordInput = $(Selectors.byId("password"));

    public SelenideElement loginButton = $(Selectors.byAttribute("type", "submit"));

    public SelenideElement flashMessage = $(Selectors.byId("flash"));

    public SelenideElement headerText = $(Selectors.byXpath("//*[@id=\"content\"]/div/h2"));

}
