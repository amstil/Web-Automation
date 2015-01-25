import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Anastasia Shpilevskaya on 21.01.2015.
 */
public class SearchTests extends BaseTest {

    @DataProvider(name = "search-data")
    public Object[][] searchDataMethod() {
        return new Object[][]{
                {"price"},
                {"computer"},
                {"проверка"}};
    }

    @DataProvider(name = "second-search-data")
    public Object[][] searchData() {
        Object[][] words = new Object[5][];
        words[0] = new Object[]{"price"};
        words[1] = new Object[]{"computer"};
        words[2] = new Object[]{"проверка"};

        return words;
    }

    @DataProvider(name = "searchData")
    public Iterator<Object[]> getDataForSearch() {
        List<Object[]> words = new ArrayList<Object[]>();
        words.add(new Object[]{"price"});
        words.add(new Object[]{"computer"});
        words.add(new Object[]{"провека"});

        return words.iterator();
    }

    @Test(dataProvider = "search-data")
    public void multysearchTestMethod(String searchData) {
        MainPage mainPage = new MainPage(getWebDriver());
        Menu search = mainPage.getMenu();
        search.getMenuButton().click();
        search.searchByText(searchData);
        System.out.println(search.getNumberOfSearchResults().getText());
    }
}
