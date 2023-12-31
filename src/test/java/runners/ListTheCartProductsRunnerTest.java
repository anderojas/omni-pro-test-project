package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/list_the_cart_products.feature",
        glue = "stepdefinitions",
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ListTheCartProductsRunnerTest {
}
