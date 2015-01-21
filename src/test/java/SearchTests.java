import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.Menu;

/**
 * Created by Anastasia Shpilevskaya on 21.01.2015.
 */
public class SearchTests extends BaseTest {

    @DataProvider(name = "search-data")
    public Object[][] searchDataMethod() {
        return new Object[][]{{"price"}, {"computer"}, {"проверка"}};
    }

    @Test(dataProvider = "search-data")
    public void multysearchTestMethod(String searchData) {
        MainPage mainPage = new MainPage(getWebDriver());
        Menu search = mainPage.getMenu();
        search.getMenuButton().click();
        search.searchByText(searchData);
        System.out.println(search.getNumberOfSearchFounds().getText());
    }

}
