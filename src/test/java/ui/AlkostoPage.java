package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.alkosto.com/")
public class AlkostoPage extends PageObject {

    public static Target CATEGORY_BTN = Target.the("Category button")
            .locatedBy("//div[contains(.,'{0}') and @class='k-grid-items-category']/parent::a");
}
