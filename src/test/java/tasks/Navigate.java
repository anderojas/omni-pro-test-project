package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import ui.AlkostoPage;

public class Navigate {

    public static Performable toTheAlkostoPage() {
        return Task.where(
                "{0} goes to the main page",
                Open.browserOn().the(AlkostoPage.class)
        );
    }
}
