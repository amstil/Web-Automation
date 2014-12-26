package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Anastasia Shpilevskaya on 09.12.2014.
 */
public class SidebarRight extends Page {

    //Sidebar right menu links Rubriki
    @FindBy(css = "div#layout div.sidebar_right li:nth-child(1) a")
    @CacheLookup
    private WebElement apiLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(2) a")
    @CacheLookup
    private WebElement administrationLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(3) a")
    @CacheLookup
    private WebElement dbLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(4) a")
    @CacheLookup
    private WebElement securityLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(5) a")
    @CacheLookup
    private WebElement designLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(6) a")
    @CacheLookup
    private WebElement managementLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(7) a")
    @CacheLookup
    private WebElement programmingLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(8) a")
    @CacheLookup
    private WebElement softwareLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(9) a")
    @CacheLookup
    private WebElement telecommunicationLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(10) a")
    @CacheLookup
    private WebElement frameworksCMSLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(11) a")
    @CacheLookup
    private WebElement frontendLink;

    @FindBy(css = "div#layout div.sidebar_right li:nth-child(12) a")
    @CacheLookup
    private WebElement differentLink;

    public SidebarRight(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickAPILink() {
        apiLink.click();
    }

    public void clickAdministrationLink() {
        administrationLink.click();
    }

    public void clickDBLink() {
        dbLink.click();
    }

    public void clickSecurityLink() {
        securityLink.click();
    }

    public void clickDesignLink() {
        designLink.click();
    }

    public void clickManagementLink() {
        managementLink.click();
    }

    public void clickProgrammingLink() {
        programmingLink.click();
    }

    public void clickSoftwareLink() {
        softwareLink.click();
    }

    public void clickTelecommunicationLink() {
        telecommunicationLink.click();
    }

    public void clickFrameworksCMSLink() {
        frameworksCMSLink.click();
    }

    public void clickFrontendLink() {
        frontendLink.click();
    }

    public void clickDifferentLink() {
        differentLink.click();
    }
}
