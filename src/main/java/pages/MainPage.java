package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Anastasia Shpilevskaya on 15.11.2014.
 */
public class MainPage extends Page {

    private SidebarRight sidebarRight;
    private Articles articles;
    private Header header;
    private Menu menu;

    public MainPage(WebDriver driver) {
        super(driver);
        sidebarRight = new SidebarRight(driver);
        articles = new Articles(driver);
        header = new Header(driver);
        menu = new Menu(driver);
    }

    public SidebarRight getSidebarRight() {
        return sidebarRight;
    }

    public Articles getArticles() {
        return articles;
    }

    public Header getHeader() {
        return header;
    }

    public Menu getMenu() {
        return menu;
    }
}
