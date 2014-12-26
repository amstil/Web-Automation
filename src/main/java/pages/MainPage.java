package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Anastasia Shpilevskaya on 15.11.2014.
 */
public class MainPage extends Page {

    private SidebarRight sidebarRight;
    private Articles articles;
    private Header header;

    public MainPage(WebDriver driver) {
        super(driver);
        sidebarRight = new SidebarRight(driver);
        articles = new Articles(driver);
        header = new Header(driver);
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
}
