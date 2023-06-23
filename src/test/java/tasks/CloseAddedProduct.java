package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.ProductsListPage;

public class CloseAddedProduct {

    public static Performable displayedModal() {
        return Task.where(
                "{0} closes the popup modal",
                Click.on(ProductsListPage.CLOSE_MODAL_BUTTON)
        );
    }
}
