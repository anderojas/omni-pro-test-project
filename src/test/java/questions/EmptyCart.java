package questions;

import net.serenitybdd.screenplay.Question;
import ui.CartPage;

public class EmptyCart {

    public static Question<String> displayedMessage() {
        return Question.about("the empty cart").answeredBy(
                actor -> CartPage.EMPTY_CART_MESSAGE_TEXT.resolveFor(actor).getText()
        );
    }
}
