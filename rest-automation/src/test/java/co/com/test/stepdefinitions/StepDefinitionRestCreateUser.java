package co.com.test.stepdefinitions;

import co.com.test.model.ModelCreateUserRest;
import co.com.test.util.constant;
import co.com.test.questions.LastResponseStatusCode;
import co.com.test.tasks.CreateUserRest;
import cucumber.api.java.en.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

public class StepDefinitionRestCreateUser {


    @When("^you create an user$")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRests) throws Exception {
        theActorInTheSpotlight().attemptsTo(CreateUserRest.with(modelCreateUserRests));
    }

    @Then("^I should see the user created$")
    public void iShouldSeeTheUserCreated() throws Exception {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(constant.VALUE)));
    }
}
