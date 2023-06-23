package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    public static Target PRODUCT_IN_CART = Target.the("product listed in cart")
            .located(By.xpath("//span[@class='item__name']"));

    public static Target PRODUCT_QUANTITY_SELECT = Target.the("product quantity selector")
            .located(By.id("quantity_0"));

    public static Target REMOVE_PRODUCT_BUTTON = Target.the("remove product button")
            .located(By.xpath("//div[@class='item-column item__info']/descendant::a[contains(@class,'remove-product')]"));

    public static Target EMPTY_CART_MESSAGE_TEXT = Target.the("empty-cart message")
            .located(By.xpath("//div[@class='cart-info']//div[contains(@class,'empty-cart-message')]"));

    public static Target REMOVED_PRODUCT_MESSAGE_TEXT = Target.the("removed product message")
            .located(By.xpath("//div[@class='cart-info']//div[contains(@class,'alert success')]"));

}
