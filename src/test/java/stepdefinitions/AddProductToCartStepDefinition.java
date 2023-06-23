package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.CartIcon;
import questions.ProductAdded;
import tasks.*;

public class AddProductToCartStepDefinition {

    @CastMember
    Actor myActor = Actor.named("Anderson");

    @Given("a customer wants to buy a product")
    public void aCustomerWantsToBuyAProduct() {
        myActor.attemptsTo(
                Navigate.toTheAlkostoPage()
        );
    }

    @Given("he selected a category {string}")
    public void heSelectedACategory(String category) {
        myActor.attemptsTo(
                SelectTheCategory.ofTheProduct(category)
        );
    }

    @Given("he selected a brand {string}")
    public void heSelectedABrand(String brand) {
        myActor.attemptsTo(
                SelectTheBrand.ofTheProduct(brand)
        );
    }

    @When("he adds the product {string} to cart")
    public void heAddsTheProductToCart(String productName) {
        myActor.attemptsTo(
                AddProduct.toTheCart(productName)
        );
    }

    @Then("a successful message {string} should be displayed")
    public void aSuccessfulMessageShouldBeDisplayed(String message) {
        Ensure.that(ProductAdded.textOfSuccessfulMessage().answeredBy(myActor)).isEqualTo(message);
    }

    @When("he closes the message")
    public void heClosesTheMessage() {
        myActor.attemptsTo(
                CloseAddedProduct.displayedModal()
        );
    }

    @Then("the cart icon should have {int} product added")
    public void theCartIconShouldHaveProductAdded(int addedProductsNumber) {
        Ensure.that(CartIcon.hasNProductsAdded().answeredBy(myActor)).isEqualTo(addedProductsNumber);
    }
}
