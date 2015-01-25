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

    public WebElement getHabrLink() {
        waitVisibleElement(habrLink);
        return habrLink;
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

    public void clickSpecialMenuByNumber(int number) {
        clickLink(getHeaderSpecialMenuLinks().get(number - 1));
        getDriver().switchTo().window((String) getDriver().getWindowHandles().toArray()[1]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Header header = (Header) o;

        if (geektimesLink != null ? !geektimesLink.equals(header.geektimesLink) : header.geektimesLink != null)
            return false;


        if (!habrLink.equals(header.habrLink)) return false;
        if (tosterLink != null ? !tosterLink.equals(header.tosterLink) : header.tosterLink != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = habrLink.hashCode();
        result = 31 * result + (geektimesLink != null ? geektimesLink.hashCode() : 0);
        result = 31 * result + (tosterLink != null ? tosterLink.hashCode() : 0);
        return result;
    }
}
