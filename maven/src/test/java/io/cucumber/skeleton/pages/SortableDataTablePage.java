package io.cucumber.skeleton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SortableDataTablePage extends Page {

    @FindBy(css = "h3")
    private WebElement pageTitle;

    @FindBy(css = "h4")
    private WebElement firstTableTitle;

    @FindBy(id = "table1")
    private WebElement exampleTableOne;

    public SortableDataTablePage(ChromeDriver driver) {
        super(driver);
    }

    public String getPageTitleText() {
        return pageTitle.getText();
    }

    public String getFirstTableTitleText() {
        return firstTableTitle.getText();
    }

    public String getExampleTableOne() {
        return exampleTableOne.getText();
    }

}
