package co.com.AdvantageDemo.stepdefinitions;

import co.com.AdvantageDemo.model.DataUserModel;
import co.com.AdvantageDemo.tasks.EnterData;
import co.com.AdvantageDemo.tasks.Load;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CreateAccountStepDefinitions {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que luis quiere registrarse en el sitio$")
    public void queLuisQuiereRegistrarseEnElSitio() throws Exception {
        theActorCalled("luis").wasAbleTo(Load.theHome());
    }

    @Cuando("^luis ingresa sus datos personales$")
    public void luisIngresaSusDatosPersonales(List<DataUserModel> User) throws Exception {
        theActorCalled("Luis").wasAbleTo(EnterData.the(User));
    }

    @Entonces("^luis debe ver su nombre de usuario (.*)$")
    public void luisDebeVerSuNombreDeUsuarioXlavm(String username) throws Exception {

    }
}