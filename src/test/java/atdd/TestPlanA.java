package atdd;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestPlanA {
  String product;
  String result;
  @Given("user select {string}")
  public void user_select(String product) {
    this.product = product;
  }

  @Given("user click {string} button")
  public void user_click_button(String string) {
    AddToCart cart = new AddToCart();
    result = cart.add(product);
  }

  @Then("system prompt {string}")
  public void system_prompt(String expected) {
    Assert.assertEquals(expected, result);
  }
}
