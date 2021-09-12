package co.com.rappi.training.calculator.utils;

import static co.com.rappi.training.calculator.utils.GeneralConstants.DIVISION;
import static co.com.rappi.training.calculator.utils.GeneralConstants.MULTIPLICATION;
import static co.com.rappi.training.calculator.utils.GeneralConstants.SUBTRACTION;
import static co.com.rappi.training.calculator.utils.GeneralConstants.SUM;

import co.com.rappi.training.calculator.userinterfaces.HomePageElements;
import net.serenitybdd.screenplay.targets.Target;

public class TargetOperator {

  public static Target operator(String sign) {
    Target target = null;

    switch (sign) {
      case SUM:
        target = HomePageElements.BTN_SUM;
        break;
      case SUBTRACTION:
        target = HomePageElements.BTN_SUBTRACTION;
        break;
      case MULTIPLICATION:
        target = HomePageElements.BTN_MULTIPLICATION;
        break;
      case DIVISION:
        target = HomePageElements.BTN_DIVISION;
        break;
    }
    return target;
  }

}
