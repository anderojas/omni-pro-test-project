package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.AlkostoPage;

public class SelectTheCategory {

    public static Performable ofTheProduct(String category) {
        return Task.where(
                "{0} selects the category " +  category + " of the product",
                Click.on(AlkostoPage.CATEGORY_BTN.of(category))
        );
    }
}
