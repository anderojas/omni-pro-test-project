package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CellphoneCategoryPage extends PageObject {

    public static Target CELLPHONE_BRAND_BTN = Target.the("Cellphone brand button")
            .locatedBy("//p[text()='{0}']/preceding-sibling::img");
}
