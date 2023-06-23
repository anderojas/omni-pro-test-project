package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ui.Select;
import ui.CartPage;

public class AddSamples {

    public static Performable toSelectedProduct(int samples) {
        return Task.where(
                "{0} adds " + samples + " more samples to the selected product",
                Select.value(Integer.toString(samples)).from(CartPage.PRODUCT_QUANTITY_SELECT)
        );
    }
}
