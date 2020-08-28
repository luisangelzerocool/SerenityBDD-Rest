package co.com.latam.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MisViajesPage {

    public static final Target LINK_DONDE_LO_ENCUENTRAS = Target.the("Link ¿donde lo encuentras?")
            .located(By.id("bookingSearchForm-c86__open-modal"));
    public static final Target ETIQUETA_CODIGO = Target.the("Etiqueta del codigo")
            .located(By.xpath("//*[@id=\"modalRecordLocator\"]/div/div/div[1]/p[1]/span[1]"));

}
