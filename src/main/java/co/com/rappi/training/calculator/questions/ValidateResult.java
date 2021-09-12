package co.com.rappi.training.calculator.questions;

import co.com.rappi.training.calculator.userinterfaces.HomePageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateResult implements Question<String> {

  public static ValidateResult withValor() {
    return new ValidateResult();
  }

  @Override
  public String answeredBy(Actor actor) {
    return Text.of(HomePageElements.TXT_OUTCOME).viewedBy(actor).asString();
  }
}
