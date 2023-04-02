package AutomationProject.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public WebDriver driver;
    @FindBy(xpath="//*[@id=\"masthead\"]/div[1]/div[4]/ul/li[10]")
    WebElement searchIcon;
    @FindBy(id = "woocommerce-product-search-field-0")
    WebElement searchField;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void SearchField (String searchWallCovering) {
     searchIcon.click();
     searchField.click();
     searchField.sendKeys(searchWallCovering);
     searchField.sendKeys(Keys.ENTER);
     searchIcon.click();
     }
}
