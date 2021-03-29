package co.com.latam.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.latam.com/es_co/")
public class LatamHomePage extends PageObject {

    public static final Target BOTON_MIS_VIAJES = Target.the("boton de Mis Viajes")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/nav/div[4]/a"));
}
