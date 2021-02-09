package co.com.latam.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FinalizacionPage {
    public static final Target BOTON_FINALIZAR = Target.the("boton de finalizar")
            .located(By.xpath("//*[@id=\"eebft49\"]/button"));
}
