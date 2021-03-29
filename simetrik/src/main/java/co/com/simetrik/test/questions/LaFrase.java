package co.com.simetrik.test.questions;

import co.com.simetrik.test.userinterface.GoogleResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaFrase implements Question<String> {

    public static LaFrase es() {
        return new LaFrase();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(GoogleResultPage.ETIQUETA_DE_RESULTADOS).viewedBy(actor).asString();
    }
}
