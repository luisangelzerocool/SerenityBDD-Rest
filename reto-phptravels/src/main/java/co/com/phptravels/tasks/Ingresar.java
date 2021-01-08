package co.com.phptravels.tasks;

import co.com.phptravels.userinterface.PhpTravelsDashboardPage;
import co.com.phptravels.userinterface.PhpTravelsHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {

    private String usuario;
    private String contrasena;
    private String llamada;

    public Ingresar(String usuario, String contrasena, String llamada) {
        super();
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.llamada = llamada;
    }

    public static Ingresar susDatos(String usuario, String contrasena, String llamada) {
        return Tasks.instrumented(Ingresar.class, usuario, contrasena, llamada);
    }

    public static Ingresar alMenuCategoria(String llamada) {
        return Tasks.instrumented(Ingresar.class,  null, null, llamada);
    }

    public static Ingresar alMenuPost(String llamada) {
        return Tasks.instrumented(Ingresar.class, null, null, llamada);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        if (llamada == "login") {
            actor.attemptsTo(Enter.theValue(usuario).into(PhpTravelsHomePage.CAMPO_EMAIL));
            actor.attemptsTo(Enter.theValue(contrasena).into(PhpTravelsHomePage.CAMPO_PASSWORD));
            actor.attemptsTo(Click.on(PhpTravelsHomePage.BOTON_LOGIN));
        }
        if (llamada == "dashboardCategoria") {
            actor.attemptsTo(Click.on(PhpTravelsDashboardPage.MENU_BLOG));
            actor.attemptsTo(Click.on(PhpTravelsDashboardPage.SUB_MENU_BLOG_CATEGORIAS));
        }
        if (llamada == "dashboardPost") {
            actor.attemptsTo(Click.on(PhpTravelsDashboardPage.MENU_BLOG));
            actor.attemptsTo(Click.on(PhpTravelsDashboardPage.SUB_MENU_POST));
        }
    }
}
