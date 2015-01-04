package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

/**
 * Created by Anastasia Shpilevskaya on 09.12.2014.
 */
public class Header extends Page {

    @FindBy(css = "div#TMpanel div[class='menu'] a:nth-child(1)")
    private WebElement habrLink;

    @FindBy(css = "div#TMpanel div[class='menu'] a:nth-child(2)")
    private WebElement geektimesLink;

    @FindBy(how = How.XPATH, using = "//div[@id='TMpanel']//div[@class='menu']//a[3]")
    private WebElement tosterLink;

    @FindBy(xpath = "//div[@id='TMpanel']//div[@class='menu']//a[4]")
    @CacheLookup
    private WebElement brainstorageLink;

    @FindBy(how = How.CSS, using = "div#TMpanel div[class='menu'] a:nth-child(5)")
    @CacheLookup
    private WebElement freelanceLink;

    @FindBy(css = "div#TMpanel div[class='menu'] a:nth-child(6)")
    private WebElement habrastorageLink;

    @FindBy(css = "div#TMpanel div[class='menu'] a")
    @CacheLookup
    private List<WebElement> headerMenu;

    @FindBy(css = "div#TMpanel div[class='menu special'] a")
    @CacheLookup
    private List<WebElement> headerSpecialMenu;

    public Header(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickHabrLink() {
        clickLink(habrLink);
    }

    public void clickGeektimesLink() {
        clickLink(geektimesLink);
    }

    public void clickTosterLink() {
        clickLink(tosterLink);
    }

    public void clickBrainstorageLink() {
        clickLink(brainstorageLink);
    }

    public void clickFreelanceLink() {
        clickLink(freelanceLink);
    }

    public void clickHabrastorageLink() {
        clickLink(habrastorageLink);
    }

    public List<WebElement> getHeaderMenuLinks() {
        return headerMenu;

    }

    public List<WebElement> getHeaderSpecialMenuLinks() {
        return headerSpecialMenu;
    }
}
