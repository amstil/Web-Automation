package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Lenovo on 09.12.2014.
 */
public class Articles extends Page {

    private By listOfArticles = By.xpath("//div [@class='posts_list']//div[starts-with(@id, 'post')]");

    public Articles(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfArticles() {
        return getDriver().findElements(listOfArticles);
    }

    public WebElement getArticleByNumber(int number) {
        return getListOfArticles().get(number - 1);
    }

}
