package io.cucumber.skeleton.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.skeleton.Utils.Utils;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;
import io.cucumber.skeleton.pages.Home;
import org.junit.jupiter.api.Assertions;

public class HomePageSteps extends Context {
  private Home home = new Home(getDriver());
  public HomePageSteps(Manager manager) {
    super(manager);
  }

  @Given("I am on the Home Page")
  public void exampleHomePageStep() {
    Assertions.assertTrue(home.getTitle().isDisplayed());
    Assertions.assertEquals(Utils.getExpectedHomePageTitle(), home.getTitleText());
  }

  @Then("the displayed list of listed examples is as expected")
  public void theDisplayedListOfListedExamplesIsAsExpected() {
    Assertions.assertEquals(Utils.expectedPageList(), home.getListOfPages());
  }


}