package co.com.latam.test.tasks;

import co.com.latam.test.userinterface.SuraHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task {

    private SuraHomePage suraHomePage;


    public static Abrir LaPaginaDeSura() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Open.browserOn(suraHomePage)

        );
    }

}
