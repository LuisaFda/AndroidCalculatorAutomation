package co.com.rappi.training.calculator.tasks;


import co.com.rappi.training.calculator.interaction.SelectNumber;
import co.com.rappi.training.calculator.models.Operations;
import co.com.rappi.training.calculator.userinterfaces.HomePageElements;
import co.com.rappi.training.calculator.utils.TargetOperator;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ExecuteOperation implements Task {

  private Operations operation;

  public ExecuteOperation(Operations operationsList) {
    this.operation = operationsList;
  }

  public static ExecuteOperation withTheData(List<Operations> operation) {
    return Tasks.instrumented(ExecuteOperation.class, operation.get(0));
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SelectNumber.forCalculating(operation.getNumberA()),
        Click.on(TargetOperator.operator(operation.getOperator())),
        SelectNumber.forCalculating(operation.getNumberB()),
        Click.on(HomePageElements.BTN_EQUAL)
    );
  }
}
