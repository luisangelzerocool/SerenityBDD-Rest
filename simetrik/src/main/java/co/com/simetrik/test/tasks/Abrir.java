package co.com.simetrik.test.tasks;

import co.com.simetrik.test.userinterface.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task {

    private GoogleHomePage googleHomePage;


    public static Abrir LaPaginaDeGoogle() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(googleHomePage));
    }

}
