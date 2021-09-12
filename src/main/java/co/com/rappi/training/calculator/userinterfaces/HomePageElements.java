package co.com.rappi.training.calculator.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class HomePageElements {

  public static final Target BTN_NUMBER = Target.the("Button number").
      locatedBy("//*[@resource-id='com.android.calculator2:id/digit_{0}']");
  public static final Target BTN_SUM = Target.the("Button sum").
      locatedBy("//*[@resource-id='com.android.calculator2:id/op_add']");
  public static final Target BTN_SUBTRACTION = Target.the("Button subtraction").
      locatedBy("//*[@resource-id='com.android.calculator2:id/op_sub']");
  public static final Target BTN_MULTIPLICATION = Target.the("Button number").
      locatedBy("//*[@resource-id='com.android.calculator2:id/op_mul']");
  public static final Target BTN_DIVISION = Target.the("Button number").
      locatedBy("//*[@resource-id='com.android.calculator2:id/op_div']");
  public static final Target BTN_EQUAL = Target.the("Button number").
      locatedBy("//*[@resource-id='com.android.calculator2:id/eq']");
  public static final Target TXT_OUTCOME = Target.the("text outcome").
      locatedBy("//*[@resource-id='com.android.calculator2:id/result']");

  private HomePageElements() {

  }
}
