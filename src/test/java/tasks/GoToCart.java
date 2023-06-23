package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.ProductsListPage;

public class GoToCart {

    public static Performable toSeeTheAddedProducts() {
        return Task.where(
                "{0} goes to the cart page",
                Click.on(ProductsListPage.GO_TO_CART_BUTTON)
        );
    }
}
