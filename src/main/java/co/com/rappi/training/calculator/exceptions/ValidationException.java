package co.com.rappi.training.calculator.exceptions;

public class ValidationException extends AssertionError {

  public static final String ERROR_VALIDATION = "The result is not as expected";

  public ValidationException(String message, Throwable cause) {
    super(message, cause);
  }

}
