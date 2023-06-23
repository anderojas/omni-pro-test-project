package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsListPage extends PageObject {

    public static Target ADD_PRODUCT_BTN = Target.the("Product result button")
            .locatedBy("//a[text()='{0}']/ancestor::li//button");

    public static Target PRODUCT_ADDED_MESSAGE_TEXT = Target.the("Added message")
            .located(By.xpath("//header[contains(@class,'cart-pop-up')]/div"));

    public static Target CLOSE_MODAL_BUTTON = Target.the("popup close button")
            .located(By.xpath("//header[contains(@class,'cart-pop-up')]/following-sibling::button"));

    public static Target NUMBER_OF_PRODUCTS_IN_CART_ICON_BUTTON = Target.the("number of products in cart button")
            .located(By.xpath("//li[contains(@id,'mycart')]/span[@class='counter']"));

    public static Target GO_TO_CART_BUTTON = Target.the("cart button")
            .located(By.xpath("//li[contains(@id,'mycart')]/descendant::span[contains(@class,'alk-icon-carrito')]"));
}
