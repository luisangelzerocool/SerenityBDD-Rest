
package co.com.AdvantageDemo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Register extends PageObject {

    public static final Target USERNAME_FIELD = Target.the("campo de nombre de usuario")
            .located(By.id("miid"));
    public static final Target EMAIL_FIELD = Target.the("campo de email")
            .located(By.xpath("mixpath"));
    public static final Target PASSWORD_FIELD = Target.the("campo de contrasena")
            .located(By.xpath("mixpath"));
    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("campo de confirmacion de contrasena")
            .located(By.xpath("mixpath"));
    public static final Target FIRST_NAME_FIELD = Target.the("campo de nombre")
            .located(By.xpath("mixpath"));
    public static final Target LAST_NAME_FIELD = Target.the("campo de apellido")
            .located(By.xpath("mixpath"));
    public static final Target PHONE_NUMBER_FIELD = Target.the("campo de numero telefonico ")
            .located(By.xpath("mixpath"));
    public static final Target COUNTRY_SELECT = Target.the("select de pais")
            .located(By.xpath("mixpath"));
    public static final Target CITY_FIELD = Target.the("campo de ciudad")
            .located(By.xpath("mixpath"));
    public static final Target ADDRESS_FIELD = Target.the("campo de dirección ")
            .located(By.xpath("mixpath"));
    public static final Target STATE_FIELD = Target.the("campo de estado o departamento")
            .located(By.xpath("mixpath"));
    public static final Target POSTAL_CODE_FIELD = Target.the("campo de codigo postal")
            .located(By.xpath("mixpath"));

    public static final Target CONDITIONS_CHECK = Target.the("check para aceptar condiciones")
            .located(By.xpath("mixpath"));

}

