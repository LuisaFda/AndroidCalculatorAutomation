package co.com.rappi.training.calculator.stepdefinitions;

import co.com.rappi.training.calculator.exceptions.ValidationException;
import co.com.rappi.training.calculator.models.Operations;
import co.com.rappi.training.calculator.questions.ValidateResult;
import co.com.rappi.training.calculator.tasks.ExecuteOperation;
import co.com.rappi.training.calculator.utils.MakeOperation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class BasicOperationsStepDefinition {

  Operations operation;

  @Given("^that the user is in the calculator app$")
  public void thatTheUserIsInTheCalculatorApp() {
    OnStage.setTheStage(new OnlineCast());
    OnStage.theActorCalled("Pepito");
  }

  @When("^you enter the data of the operation to be executed$")
  public void youEnterTheDataOfTheOperationToBeExecuted(List<Operations> operationList) {
    operation = operationList.get(0);
    OnStage.theActorInTheSpotlight().attemptsTo(
        ExecuteOperation.withTheData(operationList)
    );
  }

  @Then("^Then it will validate the result on the screen$")
  public void thenItWillValidateTheResultOnTheScreen() {
    OnStage.theActorInTheSpotlight()
        .should(
            GivenWhenThen.seeThat(
                ValidateResult.withValor(), Matchers.equalTo(
                    MakeOperation.withData(operation))
            ).orComplainWith(ValidationException.class, ValidationException.ERROR_VALIDATION)
        );

  }


}
