import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Header;
import pages.MainPage;
import pages.Menu;
import pages.Page;

import java.util.List;

/**
 * Created by Anastasia Shpilevskaya on 15.11.2014.
 */
public class HeaderMenuTest extends BaseTest {

    @Test(groups = "smoke")
    public void headerNamesCheckTest() {
        MainPage mainPage = new MainPage(getWebDriver());
        Header header = mainPage.getHeader();
        List<WebElement> links = header.getHeaderMenuLinks();
        System.out.println(links.get(2).getText());
        header.clickHabrLink();
        Assert.assertTrue(header.getHabrLink().isDisplayed());
    }

    @Test(groups = "regression", priority = 0)
    public void menuHubsTest() {
        MainPage mainPage = new MainPage(getWebDriver());
        Menu menu = mainPage.getMenu();
        menu.clickHubs();
        Assert.assertFalse(mainPage.getMenu().getHubs().isDisplayed());
    }

    @Test(groups = {"smoke", "regression"}, dependsOnMethods = "headerNamesCheckTest")
    public void specialMenuTest() {
        MainPage mainPage = new MainPage(getWebDriver());
        Header header = mainPage.getHeader();
        String parentWindowID = getWebDriver().getWindowHandle();
        header.clickSpecialMenuByNumber(2);
        Assert.assertEquals(getWebDriver().getTitle(), "Новое поколение серверов HP ProLiant Gen9");
        System.out.print(getWebDriver().getTitle() + "\n");
        getWebDriver().close();
        header.changeWindow(parentWindowID);
        System.out.println(getWebDriver().getTitle());
    }
}
