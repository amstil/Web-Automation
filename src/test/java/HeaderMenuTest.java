import org.testng.annotations.Test;
import pages.MainPage;
import pages.Page;

/**
 * Created by Lenovo on 15.11.2014.
 */
public class HeaderMenuTest extends BaseTest {

    @Test
    public void headerNamesCheckTest() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickFreelanceLink();
    }

}
