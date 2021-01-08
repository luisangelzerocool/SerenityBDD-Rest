package co.com.phptravels.questions;

import co.com.phptravels.userinterface.PhpTravelsBlogPostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElPost implements Question<String> {

    public static ElPost tieneComo(String nombrePost) {
        return new ElPost();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PhpTravelsBlogPostPage.FILA1).viewedBy(actor).asString();
    }
}
