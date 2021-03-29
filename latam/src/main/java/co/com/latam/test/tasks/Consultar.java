package co.com.latam.test.tasks;

import co.com.latam.test.userinterface.LatamHomePage;
import co.com.latam.test.userinterface.MisViajesPage;
import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Consultar implements Task {


    public Consultar() {
        super();
    }

    public static Consultar elCodigo() {
        return Tasks.instrumented(Consultar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LatamHomePage.BOTON_MIS_VIAJES));
        actor.attemptsTo(Click.on(MisViajesPage.LINK_DONDE_LO_ENCUENTRAS));

    }
}
