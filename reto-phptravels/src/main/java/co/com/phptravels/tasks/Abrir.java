package co.com.phptravels.tasks;

import co.com.phptravels.userinterface.PhpTravelsHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{

    private PhpTravelsHomePage phpTravelsHomePage;

    public static Abrir laPaginaDePhpTravels() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(phpTravelsHomePage));
    }

}
