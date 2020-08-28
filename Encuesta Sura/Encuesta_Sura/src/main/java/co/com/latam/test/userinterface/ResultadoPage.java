package co.com.latam.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ResultadoPage {

    public static final Target ETIQUETA_RESULTADO = Target.the("etiqueta de resultado de la encuesta")
            .located(By.xpath("//*[@id=\"eebft49\"]/button"));
}
