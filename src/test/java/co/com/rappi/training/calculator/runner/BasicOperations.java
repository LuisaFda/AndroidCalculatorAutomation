package co.com.rappi.training.calculator.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/basic_operations.feature",
    glue = "co.com.rappi.training.calculator.stepdefinitions",
    snippets = SnippetType.CAMELCASE)
public class BasicOperations {

}