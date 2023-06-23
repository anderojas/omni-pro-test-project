package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.ProductIs;
import tasks.GoToCart;

public class ListTheCartProductsStepDefinition {

    @When("he goes to the cart page")
    public void heGoesToTheCartPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToCart.toSeeTheAddedProducts()
        );
    }

    @Then("he should see the product {string} in the cart list")
    public void heShouldSeeTheProductInTheCartList(String productName) {
        Ensure.that(ProductIs.inCartList().answeredBy(OnStage.theActorInTheSpotlight())).isEqualTo(productName);
    }
}
