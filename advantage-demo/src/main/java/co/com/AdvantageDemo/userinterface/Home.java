
package co.com.AdvantageDemo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://advantageonlineshopping.com/#/")
public class Home extends PageObject{

    public static final Target SVG_MENU_USER = Target.the("svgMenuUser")
            .located(By.id("menuUser"));
    public static final Target JS_CREATE_NEW_ACCOUNT= Target.the("js-create-new-account")
            .located(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
}

