package co.com.simetrik.test.stepdefinitions;

import co.com.simetrik.test.questions.LaFrase;
import co.com.simetrik.test.tasks.Abrir;
import co.com.simetrik.test.tasks.Consultar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ConsultaGoogleStepDefinitions {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que Luis ingresa al sitio de google$")
    public void queLuisIngresaAlSitioDeGoogle() {
        theActorCalled("Luis").wasAbleTo(Abrir.LaPaginaDeGoogle());
    }


    @Cuando("^el ingresa la palabra \"([^\"]*)\"$")
    public void elIngresaLaPalabra(String palabra)  {
        theActorInTheSpotlight().attemptsTo(Consultar.laPalabra(palabra));

    }

    @Entonces("^Luis no deberia ver la frase \"([^\"]*)\"$")
    public void luisNoDeberiaVerLaFrase(String frase)  {
        theActorInTheSpotlight().should(seeThat(LaFrase.es(), equalTo(frase)));
    }


}
