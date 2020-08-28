package co.com.latam.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroPage {
    public static final Target CAMPO_IDENTIFICACION = Target.the("campo de numero de identificación")
            .located(By.xpath("//*[@id=\"egjm76r\"]/div[1]/input"));

    public static final Target CAMPO_NOMBRE = Target.the("campo de nombre completo")
            .located(By.xpath("//*[@id=\"e64k0da\"]/div[1]/input"));

    public static final Target BOTON_SIGUIENTE = Target.the("boton de siguiente")
            .located(By.xpath("//*[@id=\"ep4cl9b\"]/button"));

}
