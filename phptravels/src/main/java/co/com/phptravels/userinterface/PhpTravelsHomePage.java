package co.com.phptravels.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.phptravels.net/admin")
public class PhpTravelsHomePage extends PageObject{

    public static final Target CAMPO_EMAIL = Target.the("campo de email")
            .located(By.xpath("/html/body/div[2]/form[1]/div[1]/label[1]/input"));
    public static final Target CAMPO_PASSWORD = Target.the("campo de password")
            .located(By.xpath("/html/body/div[2]/form[1]/div[1]/label[2]/input"));
    public static final Target BOTON_LOGIN = Target.the("boton de login")
            .located(By.xpath("/html/body/div[2]/form[1]/button"));
}
