package pages;

import com.google.common.base.Function;
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
    private static final int TIMEOUT = 10;
    private static final int POLLING_TIME = 5;
    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void waitClickableElement(WebElement element) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitVisibleElement(final WebElement element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(TIMEOUT, TimeUnit.SECONDS)
                .pollingEvery(POLLING_TIME, TimeUnit.SECONDS);

        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                return element.isDisplayed();
            }
        });
    }

    public void clickLink(WebElement element) {
        waitVisibleElement(element);
        element.click();
    }

    public Menu openMenu(Menu menu) {
        menu.getMenuButton().click();
        return menu;
    }

}
