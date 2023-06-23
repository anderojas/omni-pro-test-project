package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.EmptyCart;
import questions.RemovedProduct;
import tasks.RemoveProduct;

public class DeleteProductFromCartStepDefinition {

    @When("he deletes the product added")
    public void heDeletesTheProductAdded() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RemoveProduct.fromTheCartList()
        );
    }

    @Then("a message {string} indicating the product was removed is displayed")
    public void aMessageIndicatingTheProductWasRemoveIsDisplayed(String removeMessage) {
        Ensure.that(RemovedProduct.displayedMessage().answeredBy(OnStage.theActorInTheSpotlight())).isEqualTo(removeMessage);
    }

    @Then("he should see an empty-cart message {string}")
    public void heShouldSeeAnEmptyCartMessage(String emptyCartMessage) {
        Ensure.that(EmptyCart.displayedMessage().answeredBy(OnStage.theActorInTheSpotlight())).isEqualTo(emptyCartMessage);
    }
}
