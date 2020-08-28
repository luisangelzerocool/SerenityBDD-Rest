package co.com.latam.test.tasks;

import co.com.latam.test.models.DatosModel;
import co.com.latam.test.userinterface.FinalizacionPage;
import co.com.latam.test.userinterface.RegistroPage;
import co.com.latam.test.userinterface.SuraHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;


public class RegistrarEncuesta implements Task {
    private List<DatosModel> datos;

    public RegistrarEncuesta(List<DatosModel> datos) {
        this.datos = datos;
    }

    public static RegistrarEncuesta conLos(List<DatosModel> datos) {
        return Tasks.instrumented(RegistrarEncuesta.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(

                WaitUntil.the(SuraHomePage.BOTON_SI_AUTORIZO, WebElementStateMatchers.isVisible()),
        Click.on(SuraHomePage.BOTON_SI_AUTORIZO),

        Enter.theValue(datos.get(0).getIdentificacion()).into(RegistroPage.CAMPO_IDENTIFICACION),
        Enter.theValue(datos.get(0).getNombre()).into(RegistroPage.CAMPO_NOMBRE),
        Click.on(RegistroPage.BOTON_SIGUIENTE),

        Click.on(FinalizacionPage.BOTON_FINALIZAR)

                );

    }
}
