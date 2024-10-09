package io.cucumber.skeleton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class Home extends Page {

  @FindBy(css = "h1")
  private WebElement title;
  @FindBy(xpath = "//*[@id=\"content\"]/ul")
  private WebElement pageList;

  private static final String homePageUrl = "https://the-internet.herokuapp.com/";

  public Home(ChromeDriver driver) {
    super(driver);
    System.out.println("Homepage title is : " + getTitle().getText());
  }

  public WebElement getTitle() {
    return title;
  }

  public String getTitleText(){
    return getTitle().getText();
  }

  public void refresh() {
    driver.navigate().refresh();
    System.out.println("Refreshed page");
  }
  public String getListOfPages(){
    return pageList.getText();
  }

}