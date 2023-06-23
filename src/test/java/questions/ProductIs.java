package questions;

import net.serenitybdd.screenplay.Question;
import ui.CartPage;

public class ProductIs {

    public static Question<String> inCartList() {
        return Question.about("the presence of the product in the cart list")
                .answeredBy(
                        actor -> CartPage.PRODUCT_IN_CART.resolveFor(actor).getText()
                );
    }
}
