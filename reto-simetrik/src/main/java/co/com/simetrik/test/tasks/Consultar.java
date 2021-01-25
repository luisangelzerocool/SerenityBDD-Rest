package co.com.simetrik.test.tasks;

import co.com.simetrik.test.userinterface.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Consultar implements Task {

    private String palabra;

    public Consultar(String palabra) { super();this.palabra = palabra; }

    public static Consultar laPalabra(String palabra) {
        return Tasks.instrumented(Consultar.class, palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(palabra).into(GoogleHomePage.CAMPO_DE_BUSQUEDA));
        actor.attemptsTo(Click.on(GoogleHomePage.CLIC_FUERA));
        actor.attemptsTo(Click.on(GoogleHomePage.BOTON_DE_BUSQUEDA));

    }
}
