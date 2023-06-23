package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.ProductsListPage;

public class CartIcon {

    public static Question<Integer> hasNProductsAdded() {
        return Question.about("the number of products added to the cart").answeredBy(
                actor -> ProductsListPage.NUMBER_OF_PRODUCTS_IN_CART_ICON_BUTTON.resolveFor(actor)
                        .getText()).asInteger();
    }

    public static void waitForNewSamplesOfProduct(int samples) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            WaitUntil.the(ProductsListPage.NUMBER_OF_PRODUCTS_IN_CART_ICON_BUTTON, WebElementStateMatchers.containsText(Integer.toString(samples)))
                    .forNoMoreThan(10).seconds()
        );
    }
}
