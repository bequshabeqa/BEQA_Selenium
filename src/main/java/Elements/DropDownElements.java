package Elements;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DropDownElements {

    public SelenideElement dropDown = $(Selectors.byId("dropdown"));
}
