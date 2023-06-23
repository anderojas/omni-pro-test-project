package questions;

import net.serenitybdd.screenplay.Question;
import ui.CartPage;

public class RemovedProduct {

    public static Question<String> displayedMessage() {
        return Question.about("the message displayed after product deletion").answeredBy(
                actor -> CartPage.REMOVED_PRODUCT_MESSAGE_TEXT.resolveFor(actor).getText()
        );
    }
}
