package io.cucumber.skeleton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPage extends Page{

    private static final String domain = "the-internet.herokuapp.com/basic_auth";
    private static final String userName = "admin";
    private static final String password = "admin";

    @FindBy(xpath = "//*[@id=\"content\"]/div/p")
    private WebElement expectedPageText;

    public BasicAuthPage(ChromeDriver driver) {
        super(driver);
    }

    public void login(){
        String loginUrl = "https://" + userName + ":" + password + "@" + domain;
        driver.get(loginUrl);
    }

    public String getBasicAuthPageText(){
        return expectedPageText.getText();
    }
}
