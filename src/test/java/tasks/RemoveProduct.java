package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.CartPage;

public class RemoveProduct {

    public static Performable fromTheCartList() {
        return Task.where(
                "{0} removes the product from the cart list",
                Click.on(CartPage.REMOVE_PRODUCT_BUTTON)
        );
    }
}
