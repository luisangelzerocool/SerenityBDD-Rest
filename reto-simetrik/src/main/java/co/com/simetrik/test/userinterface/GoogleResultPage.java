package co.com.simetrik.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleResultPage {


    public static final Target ETIQUETA_DE_RESULTADOS = Target.the("etiqueta de resultados")
            .located(By.xpath("//*[@id=\"rso\"]/div[1]/div[1]/div/div[1]/a/h3/span"));

}
