package AutomationProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MeodedHomePage {
    public WebDriver driver ;
    @FindBy (id = "menu-item-36")
    WebElement About;
    @FindBy (id = "logo")
    WebElement BackHomePage;
    public  MeodedHomePage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
    public void BackHomePage () throws InterruptedException {
        About.click();
        BackHomePage.click();
    }
        }



