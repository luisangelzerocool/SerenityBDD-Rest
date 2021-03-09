
package co.com.AdvantageDemo.tasks;

import co.com.AdvantageDemo.model.DataUserModel;
import co.com.AdvantageDemo.userinterface.Register;
import co.com.AdvantageDemo.util.Constans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class EnterData implements Task {

    private List<DataUserModel> dataUser;

    public EnterData(List<DataUserModel> dataUser) {
        super();
        this.dataUser = dataUser;
    }

    public static EnterData the(List<DataUserModel> dataUser) {
        return Tasks.instrumented(EnterData.class, dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(dataUser.get(Constans.Zero).getUsername()).into(Register.USERNAME_FIELD),
                Enter.theValue(dataUser.get(Constans.Zero).getEmail()).into(Register.EMAIL_FIELD),
                Enter.theValue(dataUser.get(Constans.Zero).getPassword()).into(Register.PASSWORD_FIELD),
                Enter.theValue(dataUser.get(Constans.Zero).getConfirmpassword()).into(Register.CONFIRM_PASSWORD_FIELD),
                Enter.theValue(dataUser.get(Constans.Zero).getFirstname()).into(Register.FIRST_NAME_FIELD),
                Enter.theValue(dataUser.get(Constans.Zero).getLastname()).into(Register.LAST_NAME_FIELD),
                Enter.theValue(dataUser.get(Constans.Zero).getPhonenumber()).into(Register.PHONE_NUMBER_FIELD),
                Enter.theValue(dataUser.get(Constans.Zero).getCountry()).into(Register.COUNTRY_SELECT),
                Enter.theValue(dataUser.get(Constans.Zero).getCity()).into(Register.CITY_FIELD),
                Enter.theValue(dataUser.get(Constans.Zero).getAddress()).into(Register.ADDRESS_FIELD),
                Enter.theValue(dataUser.get(Constans.Zero).getState()).into(Register.STATE_FIELD),
                Enter.theValue(dataUser.get(Constans.Zero).getPostalcode()).into(Register.POSTAL_CODE_FIELD),

                Click.on(Register.CONDITIONS_CHECK));
    }
}

