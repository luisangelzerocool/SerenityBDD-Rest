package co.com.phptravels.tasks;

import co.com.phptravels.model.CategoriaDataModel;
import co.com.phptravels.model.PostDataModel;
import co.com.phptravels.userinterface.PhpTravelsBlogCategoriasPage;
import co.com.phptravels.userinterface.PhpTravelsBlogPostPage;
import co.com.phptravels.util.Constans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.List;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Digitar implements Task {

    private List<CategoriaDataModel> categoria;
    private List<PostDataModel> post;
    private String llamada;

    public Digitar(List<CategoriaDataModel> categoria, List<PostDataModel> post, String llamada) {
        super();
        this.categoria = categoria;
        this.post = post;
        this.llamada = llamada;
    }

    public static Digitar datosDe(List<CategoriaDataModel> categoria, String llamada) {
        return Tasks.instrumented(Digitar.class, categoria, null, llamada);
    }

    public static Digitar datosDeNuevo(List<PostDataModel> post, String llamada) {
        return Tasks.instrumented(Digitar.class, null, post, llamada);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (llamada == "categoria") {
            // Explicit Wait
            actor.attemptsTo(
                    WaitUntil.the(PhpTravelsBlogCategoriasPage.BOTON_ADD, isVisible())
                            .forNoMoreThan(2).seconds()
            );
            actor.attemptsTo(Click.on(PhpTravelsBlogCategoriasPage.BOTON_ADD));
            actor.attemptsTo(Enter.theValue(categoria.get(Constans.Zero).getCategory_name()).into(PhpTravelsBlogCategoriasPage.CAMPO_CATEGORY_NAME));
            actor.attemptsTo(SelectFromOptions.byVisibleText(categoria.get(Constans.Zero).getStatus()).from(PhpTravelsBlogCategoriasPage.CAMPO_STATUS));
            actor.attemptsTo(Enter.theValue(categoria.get(Constans.Zero).getName_vietnam()).into(PhpTravelsBlogCategoriasPage.CAMPO_VIETNA));
            actor.attemptsTo(Enter.theValue(categoria.get(Constans.Zero).getName_russian()).into(PhpTravelsBlogCategoriasPage.CAMPO_RUSSIAN));
            actor.attemptsTo(Enter.theValue(categoria.get(Constans.Zero).getName_arabic()).into(PhpTravelsBlogCategoriasPage.CAMPO_ARABIC));
            actor.attemptsTo(Enter.theValue(categoria.get(Constans.Zero).getName_farsi()).into(PhpTravelsBlogCategoriasPage.CAMPO_FARSI));
            actor.attemptsTo(Enter.theValue(categoria.get(Constans.Zero).getName_turkish()).into(PhpTravelsBlogCategoriasPage.CAMPO_TURKISH));
            actor.attemptsTo(Enter.theValue(categoria.get(Constans.Zero).getName_french()).into(PhpTravelsBlogCategoriasPage.CAMPO_FRENCH));
            actor.attemptsTo(Enter.theValue(categoria.get(Constans.Zero).getName_spanish()).into(PhpTravelsBlogCategoriasPage.CAMPO_SPANISH));
            actor.attemptsTo(Enter.theValue(categoria.get(Constans.Zero).getName_german()).into(PhpTravelsBlogCategoriasPage.CAMPO_GERMAN));
            actor.attemptsTo(Click.on(PhpTravelsBlogCategoriasPage.BOTON_ADD2));
        }

        if (llamada == "post") {
            actor.attemptsTo(Click.on(PhpTravelsBlogPostPage.BOTON_ADD));
            actor.attemptsTo(SelectFromOptions.byVisibleText(post.get(Constans.Zero).getCategory()).from(PhpTravelsBlogPostPage.CAMPO_CATEGORY));
            actor.attemptsTo(SelectFromOptions.byVisibleText(post.get(Constans.Zero).getStatus()).from(PhpTravelsBlogPostPage.CAMPO_STATUS));
            actor.attemptsTo(Enter.theValue(post.get(Constans.Zero).getPost_title()).into(PhpTravelsBlogPostPage.CAMPO_POST_TITLE));
            // Explicit Wait
            actor.attemptsTo(
                    WaitUntil.the(PhpTravelsBlogPostPage.BOTON_SOURCE_BODY, isVisible())
                            .forNoMoreThan(2).seconds()
            );
            actor.attemptsTo(Click.on(PhpTravelsBlogPostPage.BOTON_SOURCE_BODY));
            actor.attemptsTo(Enter.theValue(post.get(Constans.Zero).getBody()).into(PhpTravelsBlogPostPage.CAMPO_BODY));
            actor.attemptsTo(Enter.theValue(post.get(Constans.Zero).getKey_words()).into(PhpTravelsBlogPostPage.CAMPO_KEY_WORDS));
            actor.attemptsTo(Enter.theValue(post.get(Constans.Zero).getDesciption()).into(PhpTravelsBlogPostPage.CAMPO_DESCRIPTION));
            actor.attemptsTo(Click.on(PhpTravelsBlogPostPage.BOTON_SUBMIT));
        }
    }
}
