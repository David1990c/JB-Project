package AutomationProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public WebDriver driver;
    @FindBy(className = "icon-search")
    WebElement SearchIcon;
    @FindBy(id = "woocommerce")
    WebElement SearchField;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void SearchField (String Search) throws InterruptedException{
     SearchIcon.findElements(By.className("icon-search"));
     SearchField.click();
     SearchField.clear();
     SearchField.sendKeys("פרח");
     SearchField.click();
    }
}
