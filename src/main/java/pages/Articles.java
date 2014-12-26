package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Anastasia Shpilevskaya on 09.12.2014.
 */
public class Articles extends Page {

    @FindBy(xpath = "//div [@class='posts_list']//div[starts-with(@id, 'post')]")
    private List<WebElement> listOfArticles;

    public Articles(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getListOfArticles() {
        return listOfArticles;
    }

    public WebElement getArticleByNumber(int number) {
        return getListOfArticles().get(number - 1);
    }

}
