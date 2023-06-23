package stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.CartIcon;
import tasks.AddSamples;

public class ModifyQuantityOfProductStepDefinition {

    @When("he adds new samples of the product {int}")
    public void heAddsNewSamplesOfTheProduct(int samples) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddSamples.toSelectedProduct(samples)
        );
        CartIcon.waitForNewSamplesOfProduct(samples);
        Ensure.that(CartIcon.hasNProductsAdded().answeredBy(OnStage.theActorInTheSpotlight())).isEqualTo(samples);
    }
}
