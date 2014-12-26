package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Anastasia Shpilevskaya on 15.11.2014.
 */
public class Page {
    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
