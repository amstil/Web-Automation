import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Anastasia Shpilevskaya on 15.11.2014.
 */
public class BaseTest {
    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @BeforeClass
    public void setUp() {
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://www.habrahabr.ru");
    }

    @AfterClass
    public void tearDown() {
        webDriver.close();
    }
}
