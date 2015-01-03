package pages;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

/**
 * Created by Anastasia Shpilevskaya on 15.11.2014.
 */
public class Page {
    private static final int visibilityTimeout = 10;
    private static final int pollingTime = 5;
    private static final int timeoutFluent = 30;

    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void waitVisibleElement(WebElement elementLocation) {
        new WebDriverWait(driver, visibilityTimeout).until(ExpectedConditions.visibilityOf(elementLocation));
    }

    public void waitClickable(final WebElement element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(timeoutFluent, TimeUnit.SECONDS)
                .pollingEvery(pollingTime, TimeUnit.SECONDS);

        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                return element.isDisplayed();
            }
        });
    }

}
