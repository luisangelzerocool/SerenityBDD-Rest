package co.com.phptravels.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PhpTravelsDashboardPage extends PageObject {

    public static final Target MENU_BLOG = Target.the("menu de blog")
            .located(By.xpath("//*[@id=\"social-sidebar-menu\"]/li[14]/a"));
    public static final Target SUB_MENU_BLOG_CATEGORIAS = Target.the("sub menu de blog categorias")
            .located(By.xpath("//*[@id=\"Blog\"]/li[2]"));
    public static final Target SUB_MENU_POST = Target.the("sub menu de post")
            .located(By.xpath("//*[@id=\"Blog\"]/li[1]"));
}
