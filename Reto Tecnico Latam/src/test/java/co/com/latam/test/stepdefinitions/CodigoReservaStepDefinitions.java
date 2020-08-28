package co.com.latam.test.stepdefinitions;

import co.com.latam.test.questions.LosDigitos;
import co.com.latam.test.tasks.Abrir;
import co.com.latam.test.tasks.Consultar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class CodigoReservaStepDefinitions {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que Luis ingresa al sitio de latam$")
    public void queLuisIngresaAlSitioDeLatam() {
        theActorCalled("Luis").wasAbleTo(Abrir.LaPaginaDeLatam());
    }

    @Cuando("^el ingresa a mis viajes y luego a ¿donde lo encuentras\\?$")
    public void elIngresaAMisViajesYLuegoADondeLoEncuentras() {
        theActorInTheSpotlight().attemptsTo(Consultar.elCodigo());
    }

    @Entonces("^Luis deberia ver un codigo de (\\d+) digitos$")
    public void luisDeberiaVerUnCodigoDeDigitos(Integer digitos) {
        theActorInTheSpotlight().should(seeThat(LosDigitos.son(), equalTo(digitos+1)));
    }

}
