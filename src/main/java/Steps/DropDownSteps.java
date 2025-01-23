package Steps;

import Elements.DropDownElements;
import com.codeborne.selenide.Condition;

public class DropDownSteps extends DropDownElements {

    public void selectOptions(String option){
        dropDown.selectOption(option);
    }
    public void selectOptions(int option){
        dropDown.selectOption(option);

    }
    public void checkSelectionOption(String option){
        dropDown.getSelectedOption().shouldHave(Condition.text(option));

    }
}
