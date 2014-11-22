package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Lenovo on 15.11.2014.
 */
public class MainPage extends Page {
    //Header elements:
    private By habrLink = By.cssSelector("div#TMpanel div[class='menu'] a:nth-child(1)");
    private By geektimesLink = By.cssSelector("div#TMpanel div[class='menu'] a:nth-child(2)");
    private By tosterLink = By.xpath("//div[@id='TMpanel']//div[@class='menu']//a[3]");
    private By brainstorageLink = By.xpath("//div[@id='TMpanel']//div[@class='menu']//a[4]");
    private By freelanceLink = By.cssSelector("div#TMpanel div[class='menu'] a:nth-child(5)");
    private By habrastorageLink = By.cssSelector("div#TMpanel div[class='menu'] a:nth-child(6)");
    private By simpleSeoLink = By.xpath("//div[@id='TMpanel']//div[@class='menu special']//a[1]");
    private By specialLinkTwo = By.cssSelector("div#TMpanel div[class='menu special'] a:nth-child(2)");
    private By headerMenu = By.cssSelector("div#TMpanel div[class='menu'] a");
    private By headerSpecialMenu = By.cssSelector("div#TMpanel div[class='menu special'] a");

    //Sidebar right menu links Rubriki
    private By apiLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(1) a");
    private By administrationLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(2) a");
    private By dbLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(3) a");
    private By securityLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(4) a");
    private By designLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(5) a");
    private By managementLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(6) a");
    private By programmingLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(7) a");
    private By softwareLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(8) a");
    private By telecommunicationLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(9) a");
    private By frameworksCMSLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(10) a");
    private By frontendLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(11) a");
    private By differentLink = By.cssSelector("div#layout div.sidebar_right li:nth-child(12) a");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickHabrLink() {
        getDriver().findElement(habrLink).click();
    }

    public void clickGeektimesLink() {
        getDriver().findElement(geektimesLink).click();
    }

    public void clickTosterLink() {
        getDriver().findElement(tosterLink).click();
    }

    public void clickBrainstorageLink() {
        getDriver().findElement(brainstorageLink).click();
    }

    public void clickFreelanceLink() {
        getDriver().findElement(freelanceLink).click();
    }

    public void clickHabrastorageLink() {
        getDriver().findElement(habrastorageLink).click();
    }

    public void clickSimpleSeoLink() {
        getDriver().findElement(simpleSeoLink).click();
    }

    public void clickMalinaForAdminLink() {
        getDriver().findElement(specialLinkTwo).click();
    }

    public List<WebElement> getHeaderMenuLinks() {
        return getDriver().findElements(headerMenu);

    }

    public List<WebElement> getHeaderSpecialMenuLinks() {
        return getDriver().findElements(headerSpecialMenu);
    }


    public void clickAPILink() {
        getDriver().findElement(apiLink).click();
    }

    public void clickAdministrationLink() {
        getDriver().findElement(administrationLink).click();
    }

    public void clickDBLink() {
        getDriver().findElement(dbLink).click();
    }

    public void clickSecurityLink() {
        getDriver().findElement(securityLink).click();
    }

    public void clickDesignLink() {
        getDriver().findElement(designLink).click();
    }

    public void clickManagementLink() {
        getDriver().findElement(managementLink).click();
    }

    public void clickProgrammingLink() {
        getDriver().findElement(programmingLink).click();
    }

    public void clickSoftwareLink() {
        getDriver().findElement(softwareLink).click();
    }

    public void clickTelecommunicationLink() {
        getDriver().findElement(telecommunicationLink).click();
    }

    public void clickFrameworksCMSLink() {
        getDriver().findElement(frameworksCMSLink).click();
    }

    public void clickFrontendLink() {
        getDriver().findElement(frontendLink).click();
    }

    public void clickDifferentLink() {
        getDriver().findElement(differentLink).click();
    }
}
