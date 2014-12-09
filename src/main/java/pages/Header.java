package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Lenovo on 09.12.2014.
 */
public class Header extends Page {

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

    public Header(WebDriver driver) {
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


}
