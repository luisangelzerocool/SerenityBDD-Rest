package co.com.phptravels.questions;

import co.com.phptravels.userinterface.PhpTravelsBlogCategoriasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaCategoria implements Question<String> {

    public static LaCategoria tieneComo(String nombreCategoria) {
        return new LaCategoria();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PhpTravelsBlogCategoriasPage.FILA1).viewedBy(actor).asString();
    }
}
