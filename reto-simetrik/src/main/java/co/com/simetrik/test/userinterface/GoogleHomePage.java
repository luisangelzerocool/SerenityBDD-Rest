package co.com.simetrik.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.es/")
public class GoogleHomePage extends PageObject {

    public static final Target CAMPO_DE_BUSQUEDA = Target.the("campo de busqueda")
            .located(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"));

    public static final Target CLIC_FUERA = Target.the("clic fuera de campo")
            .located(By.xpath("//*[@id=\"lga\"]"));

    public static final Target BOTON_DE_BUSQUEDA = Target.the("boton de busqueda")
            .located(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]"));

}
