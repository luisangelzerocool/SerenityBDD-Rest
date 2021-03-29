package co.com.phptravels.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PhpTravelsBlogPostPage extends PageObject{

    public static final Target BOTON_ADD = Target.the("boton de agregar")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/form/button"));
    public static final Target CAMPO_CATEGORY = Target.the("campo categoria")
            .located(By.xpath("//*[@id=\"content\"]/form/div[2]/div/div/div[2]/div[2]/div/select"));
    public static final Target CAMPO_POST_TITLE = Target.the("campo de titulo de post")
            .located(By.xpath("//*[@id=\"GENERAL\"]/div[1]/div[1]/div/input"));
    public static final Target CAMPO_PERMALINK = Target.the("campo de link de pagina")
            .located(By.xpath("//*[@id=\"GENERAL\"]/div[1]/div[2]/div/input"));
    public static final Target BOTON_SOURCE_BODY = Target.the("boton source body del post")
            .located(By.xpath("//*[@id=\"cke_46\"]"));
    public static final Target CAMPO_BODY = Target.the("campo del cuerpo del post")
            .located(By.xpath("//*[@id=\"cke_1_contents\"]/textarea"));
    public static final Target CAMPO_KEY_WORDS = Target.the("campo de palabras claves para SEO")
            .located(By.xpath("//*[@id=\"GENERAL\"]/div[3]/div/div/div[2]/div[1]/div/input"));
    public static final Target CAMPO_DESCRIPTION = Target.the("campo de descripción para SEO")
            .located(By.xpath("//*[@id=\"GENERAL\"]/div[3]/div/div/div[2]/div[2]/div/input"));
    public static final Target CAMPO_STATUS = Target.the("campo de estado")
            .located(By.xpath("//*[@id=\"content\"]/form/div[2]/div/div/div[2]/div[1]/div/select"));
    public static final Target BOTON_SUBMIT = Target.the("boton de submit")
            .located(By.xpath("//*[@id=\"content\"]/form/div[1]/div/div[2]/button"));
    public static final Target FILA1 = Target.the("fila 1 de la tabla")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]/a"));

}
