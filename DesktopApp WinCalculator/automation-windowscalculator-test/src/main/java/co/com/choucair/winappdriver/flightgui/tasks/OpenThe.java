package co.com.choucair.winappdriver.flightgui.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

/**
 * <h1> </h1>
 * <p>Esta clase fue modificada</p>
 * @version: 1.0
 * @author: lvanegasm (Luis Angel Vanegas Martinez)
 * @version: 1.0
 * @since: 24/06/2020
 */

public class OpenThe implements Task {

    public static OpenThe Calculator() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
