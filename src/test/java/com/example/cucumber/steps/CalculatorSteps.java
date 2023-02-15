package com.example.cucumber.steps;

import com.example.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class CalculatorSteps {

  private Calculator calculator;
  private int result;

  @Given("a calculator")
  public void aCalculator() {
    calculator = new Calculator();
  }

  @When("adding two numbers {int} and {int}")
  public void addingTogetherAnd(int a, int b) {
    result = calculator.add(a, b);
  }

  @Then("we get {int}")
  public void weGet(int expectedResult) {
    Assertions.assertThat(result).isEqualTo(expectedResult);
  }
}
