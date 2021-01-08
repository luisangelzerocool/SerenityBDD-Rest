package co.com.phptravels.stepdefinitions;

import co.com.phptravels.model.CategoriaDataModel;
import co.com.phptravels.model.PostDataModel;
import co.com.phptravels.questions.ElPost;
import co.com.phptravels.questions.LaCategoria;
import co.com.phptravels.tasks.Abrir;
import co.com.phptravels.tasks.Digitar;
import co.com.phptravels.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarCategoriaStepDefinitions {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que Luis ingresa su usuario (.*) y contraseña (.*)$")
    public void queLuisIngresaSuUsuarioAdminPhptravelsComYContraseñaDemoadmin(String usuario, String contrasena) {
        theActorCalled("Luis").wasAbleTo(Abrir.laPaginaDePhpTravels());
        theActorCalled("Luis").wasAbleTo(Ingresar.susDatos(usuario, contrasena, "login"));
    }

    @Dado("^que Luis ingresa al menú Blog - Blog Categorias$")
    public void queLuisIngresaAlMenúBlogBlogCategorias() {
        theActorCalled("Luis").wasAbleTo(Ingresar.alMenuCategoria("dashboardCategoria"));
    }

    @Cuando("^el digita los datos de la categoria$")
    public void elDigitaLosDatosDeLaCategoria(List<CategoriaDataModel> categoria) {
        theActorCalled("Luis").wasAbleTo(Digitar.datosDe(categoria, "categoria"));
    }

    @Entonces("^debería ver la nueva categoria llamada (.*)$")
    public void deberíaVerLaNuevaCategoriaLlamadaPasión(String nombreCategoria) {
        theActorCalled("Luis").should(GivenWhenThen.seeThat(LaCategoria.tieneComo(nombreCategoria)));
    }

    @Dado("^que Luis ingresa al menú Blog - Posts$")
    public void queLuisIngresaAlMenúBlogPosts()  {
        theActorCalled("Luis").wasAbleTo(Ingresar.alMenuPost("dashboardPost"));
    }

    @Cuando("^ingresa los datos del un nuevo post$")
    public void ingresaLosDatosDelUnNuevoPost(List<PostDataModel> post) {
        theActorCalled("Luis").wasAbleTo(Digitar.datosDeNuevo(post, "post"));
    }

    @Entonces("^debería ver el nuevo post llamado (.*)$")
    public void deberíaVerElNuevoPostLlamadoPostPasión(String nombrePost) {
        theActorCalled("Luis").should(GivenWhenThen.seeThat(ElPost.tieneComo(nombrePost)));
    }

}
