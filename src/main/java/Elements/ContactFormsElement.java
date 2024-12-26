package Elements;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ContactFormsElement {

    public SelenideElement firstName = $(Selectors.byXpath("//*[@id=\"contact_form\"]/input[1]"));

    public SelenideElement lastName = $(Selectors.byXpath("//*[@id=\"contact_form\"]/input[2]"));

    public SelenideElement emailValue = $(Selectors.byXpath("//*[@id=\"contact_form\"]/input[3]"));

    public SelenideElement commentsText = $(Selectors.byXpath("//*[@id=\"contact_form\"]/textarea"));

    public SelenideElement submitButton = $(Selectors.byXpath("//*[@id=\"form_buttons\"]/input[2]"));

    public SelenideElement headerText = $(Selectors.byXpath("//*[@id=\"contact_reply\"]/h1"));
}
