package co.com.rappi.training.calculator.utils;

import static co.com.rappi.training.calculator.utils.GeneralConstants.DIVISION;
import static co.com.rappi.training.calculator.utils.GeneralConstants.MULTIPLICATION;
import static co.com.rappi.training.calculator.utils.GeneralConstants.SUBTRACTION;
import static co.com.rappi.training.calculator.utils.GeneralConstants.SUM;

import co.com.rappi.training.calculator.models.Operations;

public class MakeOperation {

  public static String withData(Operations data) {
    int result = 0;
    switch (data.getOperator()) {
      case SUM:
        result = Integer.parseInt(data.getNumberA()) + Integer.parseInt(data.getNumberB());
        break;
      case SUBTRACTION:
        result = Integer.parseInt(data.getNumberA()) - Integer.parseInt(data.getNumberB());
        break;
      case MULTIPLICATION:
        result = Integer.parseInt(data.getNumberA()) * Integer.parseInt(data.getNumberB());
        break;
      case DIVISION:
        result = Integer.parseInt(data.getNumberA()) / Integer.parseInt(data.getNumberB());
        break;
    }
    return String.valueOf(result);
  }

}
