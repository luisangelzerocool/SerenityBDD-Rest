package co.com.choucair.winappdriver.flightgui.stepdefinitions;

import co.com.choucair.winappdriver.flightgui.models.DataModel;
import co.com.choucair.winappdriver.flightgui.questions.VerifyWith;
import co.com.choucair.winappdriver.flightgui.tasks.DataCal;
import co.com.choucair.winappdriver.flightgui.utils.WinAppDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
/**
 * <h1> </h1>
 * <p>Esta clase fue modificada</p>
 * @version: 1.0
 * @author: lvanegasm (Luis Angel Vanegas Martinez)
 * @version: 1.0
 * @since: 24/06/2020
 */

public class CalculatorStepDefinitions {

    @Given("^that (.*) wants to enter to use the Calculator$")
    public void thatBrandonWantsToEnterToUseTheCalculator(String brandon) {
        OnStage.theActorCalled(brandon).can(BrowseTheWeb.with(WinAppDriver.openApp()));
       //OnStage.theActorCalled(brandon).wasAbleTo(OpenThe.Calculator());
    }

    @When("^he enters the data into the calculator$")
    public void heEntersTheDataIntoTheCalculator(List<DataModel> dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(DataCal.with(dataSet));
    }

    @Then("^he verifies that the result of the mathematical operation is equal to (.*)$")
    public void heVerifiesThatTheResultOfTheMathematicalOperationIsEqualTo(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyWith.the(question)));
    }


}

