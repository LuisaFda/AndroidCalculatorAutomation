package co.com.rappi.training.calculator.interaction;


import co.com.rappi.training.calculator.userinterfaces.HomePageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectNumber implements Interaction {

  private String number;

  public SelectNumber(String number) {
    this.number = number;
  }

  public static SelectNumber forCalculating(String number) {
    return Tasks.instrumented(SelectNumber.class, number);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String[] vec = number.split("");
    for (String p : vec) {
      actor.attemptsTo(
          Click.on(HomePageElements.BTN_NUMBER.of(p))
      );
    }
  }
}