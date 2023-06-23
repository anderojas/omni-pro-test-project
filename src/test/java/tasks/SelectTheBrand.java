package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.CellphoneCategoryPage;

public class SelectTheBrand {

    public static Performable ofTheProduct(String brand) {
        return Task.where(
                "{0} selects the brand " + brand,
                Click.on(CellphoneCategoryPage.CELLPHONE_BRAND_BTN.of(brand))
        );
    }
}
