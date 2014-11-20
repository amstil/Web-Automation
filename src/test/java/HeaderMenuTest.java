import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.Page;

import java.util.List;

/**
 * Created by Lenovo on 15.11.2014.
 */
public class HeaderMenuTest extends BaseTest {

    @Test
    public void headerNamesCheckTest() {
        MainPage mainPage = new MainPage(getWebDriver());
        List<WebElement> links = mainPage.countElementsHeaderMenu();
        System.out.println(links.get(2).getText());
    }

}
