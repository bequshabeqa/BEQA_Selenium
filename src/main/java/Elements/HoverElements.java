package Elements;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HoverElements {

    public SelenideElement hoverElement = $(Selectors.byText("Hover Over Me First!"));

    public SelenideElement link = $(Selectors.byText("Hover Over Me First!")).sibling(0).$("a");
}
