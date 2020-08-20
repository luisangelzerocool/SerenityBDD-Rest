package co.com.test.tasks;

import co.com.test.interactions.ConsumeService;
import co.com.test.model.ModelCreateUserRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.*;

public class CreateUserRest implements Task {
    private List<ModelCreateUserRest> modelCreateUserRest;

    public CreateUserRest(List<ModelCreateUserRest> modelCreateUserRest) {
        this.modelCreateUserRest = modelCreateUserRest;
    }

    public static CreateUserRest with(List<ModelCreateUserRest> modelCreateUserRests) {
        return Tasks.instrumented(CreateUserRest.class, modelCreateUserRests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withPost(modelCreateUserRest.get(0).toString()));
    }
}
