package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import ui.ProductsListPage;

public class ProductAdded {

    public static Question<String> textOfSuccessfulMessage() {
        successfulMessageIsVisible();
        return Question.about("added product message").answeredBy(
                actor -> ProductsListPage.PRODUCT_ADDED_MESSAGE_TEXT.resolveFor(actor).getText()
        );
    }

    private static void successfulMessageIsVisible() {
        Question.about("visibility of added product message").answeredBy(
                actor -> ProductsListPage.PRODUCT_ADDED_MESSAGE_TEXT.isVisibleFor(actor)
        );
    }
}
