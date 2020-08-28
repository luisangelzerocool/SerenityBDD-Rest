package co.com.latam.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LosDigitos implements Question<Integer> {

    public static LosDigitos son() {
        return new LosDigitos();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return null ;//Text.of(RegistroPage.ETIQUETA_CODIGO).viewedBy(actor).asString().length();
    }
}
