package io.cucumber.skeleton.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.utils.Utils;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;
import io.cucumber.skeleton.pages.SortableDataTablePage;
import org.junit.jupiter.api.Assertions;

public class SortableDataTableSteps extends Context {

    private SortableDataTablePage sortableDataTablePage = new SortableDataTablePage(getDriver());

    public SortableDataTableSteps(Manager manager) {
        super(manager);
    }

    @When("data table example 1 is present")
    public void dataTableExampleIsPresent() {
        Assertions.assertEquals("Data Tables", sortableDataTablePage.getPageTitleText());
        Assertions.assertEquals("Example 1", sortableDataTablePage.getFirstTableTitleText());
    }

    @Then("check the table is populated as expected")
    public void checkTheTableIsPopulatedAsExpected() {
        Assertions.assertEquals(Utils.expectedExamplesTableOne(), sortableDataTablePage.getExampleTableOne());
    }
}
