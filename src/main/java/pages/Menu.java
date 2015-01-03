package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Lenovo on 29.12.2014.
 */
public class Menu extends Page {
    @FindBy(css = "div#navbar span[class='g-icon g-icon-burger']")
    private WebElement menuButton;
    @FindBy(css = "div#menu_tab> div:first-child")
    private WebElement razdely;
    @FindBy(css = "div#menu_tab input[name='q']")
    private WebElement search;
    @FindBy(css = "div#menu_tab div.menu a[href*='posts']")
    private WebElement posts;
    @FindBy(css = "div#menu_tab div.menu a[href*='hubs']")
    private WebElement hubs;
    @FindBy(css = "div#menu_tab div.menu a[href*='companies']")
    private WebElement companies;
    @FindBy(css = "div#menu_tab div.menu a[href*='users']")
    private WebElement usersMenu;
    @FindBy(css = "div#menu_tab div.menu a.new_window")
    private WebElement qaMenu;
    @FindBy(css = "div#menu_tab div.menu a[href*='sandbox']")
    private WebElement sandbox;
    @FindBy(css = "div#menu_tab div.menu a[href*='exchange']")
    private WebElement exchangeAuthors;

    public Menu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getMenuButton() {
        return menuButton;
    }

    public void checkTitleRazdely() {
        waitVisibleElement(razdely);
        razdely.isDisplayed();
    }

    public void searchByText(String searchtext) {
        waitVisibleElement(search);
        search.sendKeys(searchtext);
        search.submit();
    }

    public void clickPosts() {
        waitVisibleElement(posts);
        posts.click();
    }

    public void clickHubs() {
        waitVisibleElement(hubs);
        hubs.click();
    }

    public void clickCompanies() {
        waitVisibleElement(companies);
        companies.click();
    }

    public void clickUserMenu() {
        waitVisibleElement(usersMenu);
        usersMenu.click();
    }

    public void clickQAMenu() {
        waitVisibleElement(qaMenu);
        qaMenu.click();
    }

    public void clickSandbox() {
        waitVisibleElement(sandbox);
        sandbox.click();
    }

    public void clickExchangeAuthors() {
        waitVisibleElement(exchangeAuthors);
        exchangeAuthors.click();
    }
}
