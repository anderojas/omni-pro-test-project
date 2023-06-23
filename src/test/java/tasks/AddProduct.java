package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.ProductsListPage;

public class AddProduct {

    public static Performable toTheCart(String productName) {
        return Task.where(
                "{0} selects the product with name " + productName,
                Click.on(ProductsListPage.ADD_PRODUCT_BTN.of(productName))
        );
    }
}
