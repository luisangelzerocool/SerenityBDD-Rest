package co.com.phptravels.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PhpTravelsBlogCategoriasPage extends PageObject {

    public static final Target BOTON_ADD = Target.the("boton de agregar")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[1]/button/i"));
    public static final Target CAMPO_CATEGORY_NAME = Target.the("campo nombre de categoria")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[1]/div/input"));
    public static final Target CAMPO_STATUS = Target.the("campo de status")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[2]/div/select"));
    public static final Target CAMPO_VIETNA = Target.the("campo nombre vietnamita")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[3]/div/input"));
    public static final Target CAMPO_RUSSIAN = Target.the("campo nombre russo")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[4]/div/input"));
    public static final Target CAMPO_ARABIC = Target.the("campo nombre arabe")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[5]/div/input"));
    public static final Target CAMPO_FARSI = Target.the("campo nombre islam")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[6]/div/input"));
    public static final Target CAMPO_TURKISH = Target.the("campo nombre turco")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[7]/div/input"));
    public static final Target CAMPO_FRENCH = Target.the("campo nombre francés")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[8]/div/input"));
    public static final Target CAMPO_SPANISH = Target.the("campo nombre español")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[9]/div/input"));
    public static final Target CAMPO_GERMAN = Target.the("campo nombre aleman")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[10]/div/input"));
    public static final Target BOTON_ADD2 = Target.the("boton de agregar 2")
            .located(By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[3]/button[2]"));
    public static final Target FILA1 = Target.the("fila 1 de la tabla")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[3]"));

}
