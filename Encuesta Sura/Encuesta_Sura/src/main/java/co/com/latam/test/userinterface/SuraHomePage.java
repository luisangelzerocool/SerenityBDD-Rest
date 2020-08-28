package co.com.latam.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.segurossura.com.co/covid-19/encuestas/paginas/sintomas.aspx?nitEmpresa=811020576&sector=VElD&idEmpresa=ODExMDIwNTc2&mail=sst@choucairtesting.com")
public class SuraHomePage extends PageObject {

    public static final Target BOTON_SI_AUTORIZO = Target.the("boton de si autorizo")
            .located(By.xpath("//*[@id=\"ecf0a0s\"]/button"));

}
