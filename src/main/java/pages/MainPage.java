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
    private WebElement habrLink;
    private WebElement geektimesLink;
    private WebElement tosterLink;
    private WebElement brainstorageLink;
    private WebElement freelanceLink;
    private WebElement habrastorageLink;
    private WebElement simpleSeoLink;
    private WebElement malinaForAdminLink;
    private List<WebElement> headerMenu;
    private List<WebElement> headerSpecialMenu;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickHabrLink() {
        habrLink = getDriver().findElement(By.
                cssSelector("div#TMpanel div[class='menu'] a:nth-child(1)"));
        habrLink.click();
    }

    public void clickGeektimesLink() {
        geektimesLink = getDriver().findElement(By.
                cssSelector("div#TMpanel div[class='menu'] a:nth-child(2)"));
        geektimesLink.click();
    }

    public void clickTosterLink() {
        tosterLink = getDriver().findElement(By.
                xpath("//div[@id='TMpanel']//div[@class='menu']//a[3]"));
        tosterLink.click();
    }

    public void clickBrainstorageLink() {
        brainstorageLink = getDriver().findElement(By.
                xpath("//div[@id='TMpanel']//div[@class='menu']//a[4]"));
        brainstorageLink.click();
    }

    public void clickFreelanceLink() {
        freelanceLink = getDriver().findElement(By.id("TMpanel")).
                findElement(By.cssSelector("div[class='menu'] a:nth-child(5)"));
        freelanceLink.click();
    }

    public void clickHabrastorageLink() {
        habrastorageLink = getDriver().findElement(By.
                cssSelector("div#TMpanel div[class=menu] a:nth-child(6)"));
        habrastorageLink.click();
    }

    public void clickSimpleSeoLink() {
        simpleSeoLink = getDriver().findElement(By.className("'menu special'")).
                findElement(By.linkText("Простое SEO-продвижение"));
        simpleSeoLink.click();
    }

    public void clickMalinaForAdminLink() {
        malinaForAdminLink = getDriver().findElement(By.
                cssSelector("div#TMpanel div[class='menu special'] a:nth-child(2)"));
        malinaForAdminLink.click();
    }

    public void countElementsHeaderMenu() {
        headerMenu = getDriver().findElements(By.cssSelector("div#TMpanel div[class=menu]"));
    }
}
