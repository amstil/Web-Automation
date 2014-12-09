package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Lenovo on 09.12.2014.
 */
public class SidebarRight extends Page {


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

    public SidebarRight(WebDriver driver) {
        super(driver);
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
