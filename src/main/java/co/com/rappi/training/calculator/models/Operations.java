package co.com.rappi.training.calculator.models;

public class Operations {

  private String numberA;
  private String numberB;
  private String operator;
  private String result;

  public Operations(String numberA, String numberB, String operator) {
    this.numberA = numberA;
    this.numberB = numberB;
    this.operator = operator;
  }

  public String getNumberA() {
    return numberA;
  }

  public String getNumberB() {
    return numberB;
  }

  public String getOperator() {
    return operator;
  }

}
