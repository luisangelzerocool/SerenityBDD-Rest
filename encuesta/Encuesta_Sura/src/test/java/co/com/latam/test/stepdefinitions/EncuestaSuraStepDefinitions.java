package co.com.latam.test.stepdefinitions;

import co.com.latam.test.models.DatosModel;
import co.com.latam.test.tasks.Abrir;
import co.com.latam.test.tasks.RegistrarEncuesta;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class EncuestaSuraStepDefinitions {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }


    @Dado("^que Luis ingresa al sitio de encuesta de Sura$")
    public void queLuisIngresaAlSitioDeEncuestaDeSura(){
        theActorCalled("Luis").wasAbleTo(Abrir.LaPaginaDeSura());
    }

    @Cuando("^el digita los datos de la encuesta solicitada$")
    public void elDigitaLosDatosDeLaEncuestaSolicitada(List<DatosModel> datos)  {
        theActorInTheSpotlight().attemptsTo(RegistrarEncuesta.conLos(datos));
    }

    @Entonces("^Luis deberia ver la palabra$")
    public void luisDeberiaVerLaPalabra() {

    }

}
