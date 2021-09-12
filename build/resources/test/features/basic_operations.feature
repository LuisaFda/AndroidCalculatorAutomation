Feature: Basic operations with the calculator
  As a calculator user
  I need to use the basic operations
  To know the result

  Scenario Outline: Basic Operations
    Given that the user is in the calculator app
    When you enter the data of the operation to be executed
      | numberA   | numberB   | operator   |
      | <numberA> | <numberB> | <operator> |

    Then Then it will validate the result on the screen

    Examples:
      | numberA | numberB | operator |
      | 74      | 2       | *        |
      | 2       | 1       | +        |
      | 50      | 2       | -        |
      | 951     | 3       | /        |
      | 98      | 2       | /        |