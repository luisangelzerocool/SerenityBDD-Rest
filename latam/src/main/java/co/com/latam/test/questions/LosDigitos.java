package co.com.latam.test.questions;

import co.com.latam.test.userinterface.MisViajesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LosDigitos implements Question<Integer> {

    public static LosDigitos son() {
        return new LosDigitos();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return Text.of(MisViajesPage.ETIQUETA_CODIGO).viewedBy(actor).asString().length();
    }
}
