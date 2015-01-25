import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by Anastasia Shpilevskaya on 15.11.2014.
 */
public class BaseTest {
    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        //webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webDriver.get("http://www.habrahabr.ru");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        webDriver.close();
    }
}
