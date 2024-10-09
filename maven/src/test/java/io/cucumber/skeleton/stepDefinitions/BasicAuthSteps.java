package io.cucumber.skeleton.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;
import io.cucumber.skeleton.pages.BasicAuthPage;
import org.junit.jupiter.api.Assertions;

public class BasicAuthSteps extends Context {

    private BasicAuthPage basicAuthPage = new BasicAuthPage(getDriver());

    public BasicAuthSteps(Manager manager) {
        super(manager);
    }

    @And("valid credentials are supplied")
    public void validCredentialsAreSupplied() {
        basicAuthPage.login();
    }

    @Then("Congratulations should be displayed")
    public void congratulationsShouldBeDisplayed() {
        Assertions.assertEquals("Congratulations! You must have the proper credentials.", basicAuthPage.getBasicAuthPageText());
    }
}
